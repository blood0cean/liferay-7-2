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
 * This class is used by SOAP remote services, specifically {@link blood0cean.com.github.office.schedule.service.http.OfficeScheduleServiceSoap}.
 *
 * @author Blood 0cean
 * @generated
 */
public class OfficeScheduleSoap implements Serializable {

	public static OfficeScheduleSoap toSoapModel(OfficeSchedule model) {
		OfficeScheduleSoap soapModel = new OfficeScheduleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOfficeScheduleId(model.getOfficeScheduleId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOfficeId(model.getOfficeId());
		soapModel.setSpots(model.getSpots());
		soapModel.setDate(model.getDate());

		return soapModel;
	}

	public static OfficeScheduleSoap[] toSoapModels(OfficeSchedule[] models) {
		OfficeScheduleSoap[] soapModels = new OfficeScheduleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OfficeScheduleSoap[][] toSoapModels(
		OfficeSchedule[][] models) {

		OfficeScheduleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new OfficeScheduleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OfficeScheduleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OfficeScheduleSoap[] toSoapModels(
		List<OfficeSchedule> models) {

		List<OfficeScheduleSoap> soapModels = new ArrayList<OfficeScheduleSoap>(
			models.size());

		for (OfficeSchedule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OfficeScheduleSoap[soapModels.size()]);
	}

	public OfficeScheduleSoap() {
	}

	public long getPrimaryKey() {
		return _officeScheduleId;
	}

	public void setPrimaryKey(long pk) {
		setOfficeScheduleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOfficeScheduleId() {
		return _officeScheduleId;
	}

	public void setOfficeScheduleId(long officeScheduleId) {
		_officeScheduleId = officeScheduleId;
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

	public long getOfficeId() {
		return _officeId;
	}

	public void setOfficeId(long officeId) {
		_officeId = officeId;
	}

	public int getSpots() {
		return _spots;
	}

	public void setSpots(int spots) {
		_spots = spots;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	private String _uuid;
	private long _officeScheduleId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _officeId;
	private int _spots;
	private Date _date;

}