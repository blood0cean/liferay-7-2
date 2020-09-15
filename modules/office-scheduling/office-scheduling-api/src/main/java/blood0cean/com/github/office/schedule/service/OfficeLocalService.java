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

package blood0cean.com.github.office.schedule.service;

import blood0cean.com.github.office.schedule.exception.NoSuchOfficeException;
import blood0cean.com.github.office.schedule.model.Office;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Office. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Blood 0cean
 * @see OfficeLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface OfficeLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfficeLocalServiceUtil} to access the office local service. Add custom service methods to <code>blood0cean.com.github.office.schedule.service.impl.OfficeLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Office addOffice(
			long userId, String name, String description, boolean active,
			int maxPeopleAllowed, String[] weekOpenDays,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the office to the database. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Office addOffice(Office office);

	/**
	 * Creates a new office with the primary key. Does not add the office to the database.
	 *
	 * @param officeId the primary key for the new office
	 * @return the new office
	 */
	@Transactional(enabled = false)
	public Office createOffice(long officeId);

	/**
	 * Deletes the office with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeId the primary key of the office
	 * @return the office that was removed
	 * @throws NoSuchOfficeException
	 * @throws PortalException if a office with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Office deleteOffice(long officeId)
		throws NoSuchOfficeException, PortalException;

	/**
	 * Deletes the office from the database. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Office deleteOffice(Office office);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Office fetchOffice(long officeId);

	/**
	 * Returns the office matching the UUID and group.
	 *
	 * @param uuid the office's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Office fetchOfficeByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the office with the primary key.
	 *
	 * @param officeId the primary key of the office
	 * @return the office
	 * @throws PortalException if a office with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Office getOffice(long officeId) throws PortalException;

	/**
	 * Returns the office matching the UUID and group.
	 *
	 * @param uuid the office's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office
	 * @throws PortalException if a matching office could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Office getOfficeByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the offices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of offices
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOffices(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOffices(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOffices(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOffices(
		long groupId, int start, int end, OrderByComparator<Office> obc);

	/**
	 * Returns all the offices matching the UUID and company.
	 *
	 * @param uuid the UUID of the offices
	 * @param companyId the primary key of the company
	 * @return the matching offices, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOfficesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of offices matching the UUID and company.
	 *
	 * @param uuid the UUID of the offices
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching offices, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Office> getOfficesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Office> orderByComparator);

	/**
	 * Returns the number of offices.
	 *
	 * @return the number of offices
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOfficesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getOfficesCount(long groupId);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public Office updateOffice(
			long userId, long officeId, String name, String description,
			boolean active, int maxPeopleAllowed, String[] weekOpenDays,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the office in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Office updateOffice(Office office);

}