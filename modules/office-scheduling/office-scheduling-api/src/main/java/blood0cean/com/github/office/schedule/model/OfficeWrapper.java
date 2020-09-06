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
 * This class is a wrapper for {@link Office}.
 * </p>
 *
 * @author Blood 0cean
 * @see Office
 * @generated
 */
public class OfficeWrapper
	extends BaseModelWrapper<Office> implements ModelWrapper<Office>, Office {

	public OfficeWrapper(Office office) {
		super(office);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("officeId", getOfficeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("active", isActive());
		attributes.put("maxPeopleAllowed", getMaxPeopleAllowed());
		attributes.put("availableFrom", getAvailableFrom());
		attributes.put("availableUntil", getAvailableUntil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long officeId = (Long)attributes.get("officeId");

		if (officeId != null) {
			setOfficeId(officeId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer maxPeopleAllowed = (Integer)attributes.get("maxPeopleAllowed");

		if (maxPeopleAllowed != null) {
			setMaxPeopleAllowed(maxPeopleAllowed);
		}

		Date availableFrom = (Date)attributes.get("availableFrom");

		if (availableFrom != null) {
			setAvailableFrom(availableFrom);
		}

		Date availableUntil = (Date)attributes.get("availableUntil");

		if (availableUntil != null) {
			setAvailableUntil(availableUntil);
		}
	}

	/**
	 * Returns the active of this office.
	 *
	 * @return the active of this office
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the available from of this office.
	 *
	 * @return the available from of this office
	 */
	@Override
	public Date getAvailableFrom() {
		return model.getAvailableFrom();
	}

	/**
	 * Returns the available until of this office.
	 *
	 * @return the available until of this office
	 */
	@Override
	public Date getAvailableUntil() {
		return model.getAvailableUntil();
	}

	/**
	 * Returns the company ID of this office.
	 *
	 * @return the company ID of this office
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this office.
	 *
	 * @return the create date of this office
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this office.
	 *
	 * @return the description of this office
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this office.
	 *
	 * @return the group ID of this office
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the max people allowed of this office.
	 *
	 * @return the max people allowed of this office
	 */
	@Override
	public int getMaxPeopleAllowed() {
		return model.getMaxPeopleAllowed();
	}

	/**
	 * Returns the modified date of this office.
	 *
	 * @return the modified date of this office
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this office.
	 *
	 * @return the name of this office
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the office ID of this office.
	 *
	 * @return the office ID of this office
	 */
	@Override
	public long getOfficeId() {
		return model.getOfficeId();
	}

	/**
	 * Returns the primary key of this office.
	 *
	 * @return the primary key of this office
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this office.
	 *
	 * @return the user ID of this office
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this office.
	 *
	 * @return the user name of this office
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this office.
	 *
	 * @return the user uuid of this office
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this office.
	 *
	 * @return the uuid of this office
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this office is active.
	 *
	 * @return <code>true</code> if this office is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this office is active.
	 *
	 * @param active the active of this office
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the available from of this office.
	 *
	 * @param availableFrom the available from of this office
	 */
	@Override
	public void setAvailableFrom(Date availableFrom) {
		model.setAvailableFrom(availableFrom);
	}

	/**
	 * Sets the available until of this office.
	 *
	 * @param availableUntil the available until of this office
	 */
	@Override
	public void setAvailableUntil(Date availableUntil) {
		model.setAvailableUntil(availableUntil);
	}

	/**
	 * Sets the company ID of this office.
	 *
	 * @param companyId the company ID of this office
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this office.
	 *
	 * @param createDate the create date of this office
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this office.
	 *
	 * @param description the description of this office
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this office.
	 *
	 * @param groupId the group ID of this office
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the max people allowed of this office.
	 *
	 * @param maxPeopleAllowed the max people allowed of this office
	 */
	@Override
	public void setMaxPeopleAllowed(int maxPeopleAllowed) {
		model.setMaxPeopleAllowed(maxPeopleAllowed);
	}

	/**
	 * Sets the modified date of this office.
	 *
	 * @param modifiedDate the modified date of this office
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this office.
	 *
	 * @param name the name of this office
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the office ID of this office.
	 *
	 * @param officeId the office ID of this office
	 */
	@Override
	public void setOfficeId(long officeId) {
		model.setOfficeId(officeId);
	}

	/**
	 * Sets the primary key of this office.
	 *
	 * @param primaryKey the primary key of this office
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this office.
	 *
	 * @param userId the user ID of this office
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this office.
	 *
	 * @param userName the user name of this office
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this office.
	 *
	 * @param userUuid the user uuid of this office
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this office.
	 *
	 * @param uuid the uuid of this office
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
	protected OfficeWrapper wrap(Office office) {
		return new OfficeWrapper(office);
	}

}