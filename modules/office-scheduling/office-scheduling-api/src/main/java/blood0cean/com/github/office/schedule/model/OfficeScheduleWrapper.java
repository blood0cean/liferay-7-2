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

package blood0cean.com.github.office.schedule.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OfficeSchedule}.
 * </p>
 *
 * @author Blood 0cean
 * @see OfficeSchedule
 * @generated
 */
public class OfficeScheduleWrapper
	extends BaseModelWrapper<OfficeSchedule>
	implements ModelWrapper<OfficeSchedule>, OfficeSchedule {

	public OfficeScheduleWrapper(OfficeSchedule officeSchedule) {
		super(officeSchedule);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("officeScheduleId", getOfficeScheduleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("officeId", getOfficeId());
		attributes.put("spots", getSpots());
		attributes.put("date", getDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long officeScheduleId = (Long)attributes.get("officeScheduleId");

		if (officeScheduleId != null) {
			setOfficeScheduleId(officeScheduleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long officeId = (Long)attributes.get("officeId");

		if (officeId != null) {
			setOfficeId(officeId);
		}

		Integer spots = (Integer)attributes.get("spots");

		if (spots != null) {
			setSpots(spots);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}
	}

	/**
	 * Returns the company ID of this office schedule.
	 *
	 * @return the company ID of this office schedule
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this office schedule.
	 *
	 * @return the create date of this office schedule
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this office schedule.
	 *
	 * @return the date of this office schedule
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the group ID of this office schedule.
	 *
	 * @return the group ID of this office schedule
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this office schedule.
	 *
	 * @return the modified date of this office schedule
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the office ID of this office schedule.
	 *
	 * @return the office ID of this office schedule
	 */
	@Override
	public long getOfficeId() {
		return model.getOfficeId();
	}

	/**
	 * Returns the office schedule ID of this office schedule.
	 *
	 * @return the office schedule ID of this office schedule
	 */
	@Override
	public long getOfficeScheduleId() {
		return model.getOfficeScheduleId();
	}

	/**
	 * Returns the primary key of this office schedule.
	 *
	 * @return the primary key of this office schedule
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the spots of this office schedule.
	 *
	 * @return the spots of this office schedule
	 */
	@Override
	public int getSpots() {
		return model.getSpots();
	}

	/**
	 * Returns the user ID of this office schedule.
	 *
	 * @return the user ID of this office schedule
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this office schedule.
	 *
	 * @return the user name of this office schedule
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this office schedule.
	 *
	 * @return the user uuid of this office schedule
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this office schedule.
	 *
	 * @return the uuid of this office schedule
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this office schedule.
	 *
	 * @param companyId the company ID of this office schedule
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this office schedule.
	 *
	 * @param createDate the create date of this office schedule
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this office schedule.
	 *
	 * @param date the date of this office schedule
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the group ID of this office schedule.
	 *
	 * @param groupId the group ID of this office schedule
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this office schedule.
	 *
	 * @param modifiedDate the modified date of this office schedule
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the office ID of this office schedule.
	 *
	 * @param officeId the office ID of this office schedule
	 */
	@Override
	public void setOfficeId(long officeId) {
		model.setOfficeId(officeId);
	}

	/**
	 * Sets the office schedule ID of this office schedule.
	 *
	 * @param officeScheduleId the office schedule ID of this office schedule
	 */
	@Override
	public void setOfficeScheduleId(long officeScheduleId) {
		model.setOfficeScheduleId(officeScheduleId);
	}

	/**
	 * Sets the primary key of this office schedule.
	 *
	 * @param primaryKey the primary key of this office schedule
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the spots of this office schedule.
	 *
	 * @param spots the spots of this office schedule
	 */
	@Override
	public void setSpots(int spots) {
		model.setSpots(spots);
	}

	/**
	 * Sets the user ID of this office schedule.
	 *
	 * @param userId the user ID of this office schedule
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this office schedule.
	 *
	 * @param userName the user name of this office schedule
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this office schedule.
	 *
	 * @param userUuid the user uuid of this office schedule
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this office schedule.
	 *
	 * @param uuid the uuid of this office schedule
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected OfficeScheduleWrapper wrap(OfficeSchedule officeSchedule) {
		return new OfficeScheduleWrapper(officeSchedule);
	}

}