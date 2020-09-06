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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link blood0cean.com.github.office.schedule.service.http.OfficeServiceSoap}.
 *
 * @author Blood 0cean
 * @generated
 */
public class OfficeSoap implements Serializable {

	public static OfficeSoap toSoapModel(Office model) {
		OfficeSoap soapModel = new OfficeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOfficeId(model.getOfficeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setActive(model.isActive());
		soapModel.setMaxPeopleAllowed(model.getMaxPeopleAllowed());
		soapModel.setAvailableFrom(model.getAvailableFrom());
		soapModel.setAvailableUntil(model.getAvailableUntil());

		return soapModel;
	}

	public static OfficeSoap[] toSoapModels(Office[] models) {
		OfficeSoap[] soapModels = new OfficeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OfficeSoap[][] toSoapModels(Office[][] models) {
		OfficeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OfficeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OfficeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OfficeSoap[] toSoapModels(List<Office> models) {
		List<OfficeSoap> soapModels = new ArrayList<OfficeSoap>(models.size());

		for (Office model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OfficeSoap[soapModels.size()]);
	}

	public OfficeSoap() {
	}

	public long getPrimaryKey() {
		return _officeId;
	}

	public void setPrimaryKey(long pk) {
		setOfficeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOfficeId() {
		return _officeId;
	}

	public void setOfficeId(long officeId) {
		_officeId = officeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public int getMaxPeopleAllowed() {
		return _maxPeopleAllowed;
	}

	public void setMaxPeopleAllowed(int maxPeopleAllowed) {
		_maxPeopleAllowed = maxPeopleAllowed;
	}

	public Date getAvailableFrom() {
		return _availableFrom;
	}

	public void setAvailableFrom(Date availableFrom) {
		_availableFrom = availableFrom;
	}

	public Date getAvailableUntil() {
		return _availableUntil;
	}

	public void setAvailableUntil(Date availableUntil) {
		_availableUntil = availableUntil;
	}

	private String _uuid;
	private long _officeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private boolean _active;
	private int _maxPeopleAllowed;
	private Date _availableFrom;
	private Date _availableUntil;

}