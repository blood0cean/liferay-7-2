/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package blood0cean.com.github.office.schedule.service.impl;

import blood0cean.com.github.office.schedule.exception.NoSuchOfficeException;
import blood0cean.com.github.office.schedule.exception.OfficeNameRequiredException;
import blood0cean.com.github.office.schedule.model.Office;
import blood0cean.com.github.office.schedule.service.base.OfficeLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the office local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>blood0cean.com.github.office.schedule.service.OfficeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Blood 0cean
 * @see OfficeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=blood0cean.com.github.office.schedule.model.Office",
	service = AopService.class
)
public class OfficeLocalServiceImpl extends OfficeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>blood0cean.com.github.office.schedule.service.OfficeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>blood0cean.com.github.office.schedule.service.OfficeLocalServiceUtil</code>.
	 */
	public Office addOffice(long userId, String name, String description, boolean active, int maxPeopleAllowed, ServiceContext serviceContext) throws PortalException {
		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		
		validate(name);
		
		long officeId = counterLocalService.increment();
		Office office = officePersistence.create(officeId);
		office.setUuid(serviceContext.getUuid());
		office.setGroupId(groupId);
		office.setCompanyId(user.getCompanyId());
		office.setUserId(userId);
		office.setUserName(user.getFullName());
		
		Date now = new Date();
		office.setCreateDate(serviceContext.getCreateDate(now));
		office.setModifiedDate(serviceContext.getModifiedDate(now));

		office.setName(name);
		office.setDescription(description);
		office.setActive(active);
		office.setMaxPeopleAllowed(maxPeopleAllowed);
		
		office.setExpandoBridgeAttributes(serviceContext);
		
		return officePersistence.update(office);
	}
	
	public Office updateOffice(long userId, long officeId, String name, String description, boolean active, int maxPeopleAllowed, ServiceContext serviceContext) throws PortalException {
		User user = userLocalService.getUserById(userId);
		
		validate(name);
		
		Office office = officePersistence.findByPrimaryKey(officeId);
		
		office.setUserId(userId);
		office.setUserName(user.getFullName());
		office.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		office.setName(name);
		office.setDescription(description);
		office.setActive(active);
		office.setMaxPeopleAllowed(maxPeopleAllowed);
		
		office.setExpandoBridgeAttributes(serviceContext);
		
		return officePersistence.update(office);
	}
	
	public Office deleteOffice(Office office) {
		return officePersistence.remove(office);
	}
	
	public Office deleteOffice(long officeId) throws NoSuchOfficeException {
		return officePersistence.remove(officeId);
	}
	
	public List<Office> getOffices(long groupId) {
		return officePersistence.findByGroupId(groupId);
	}
	public List<Office> getOffices(long groupId, int start, int end, OrderByComparator<Office> obc) {
		return officePersistence.findByGroupId(groupId, start, end, obc);
	}
	public List<Office> getOffices(long groupId, int start, int end) {
		return officePersistence.findByGroupId(groupId, start, end);
	}
	public long getOfficesCount(long groupId) {
		return officePersistence.countByGroupId(groupId);
	}
	
	
	protected void validate(String name) throws OfficeNameRequiredException {
		if (Validator.isNull(name)) {
			throw new OfficeNameRequiredException();
		}
	}
}