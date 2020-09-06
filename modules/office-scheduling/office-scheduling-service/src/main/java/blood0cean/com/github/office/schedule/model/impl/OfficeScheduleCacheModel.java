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

package blood0cean.com.github.office.schedule.model.impl;

import blood0cean.com.github.office.schedule.model.OfficeSchedule;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OfficeSchedule in entity cache.
 *
 * @author Blood 0cean
 * @generated
 */
public class OfficeScheduleCacheModel
	implements CacheModel<OfficeSchedule>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfficeScheduleCacheModel)) {
			return false;
		}

		OfficeScheduleCacheModel officeScheduleCacheModel =
			(OfficeScheduleCacheModel)obj;

		if (officeScheduleId == officeScheduleCacheModel.officeScheduleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, officeScheduleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", officeScheduleId=");
		sb.append(officeScheduleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", officeId=");
		sb.append(officeId);
		sb.append(", spots=");
		sb.append(spots);
		sb.append(", date=");
		sb.append(date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OfficeSchedule toEntityModel() {
		OfficeScheduleImpl officeScheduleImpl = new OfficeScheduleImpl();

		if (uuid == null) {
			officeScheduleImpl.setUuid("");
		}
		else {
			officeScheduleImpl.setUuid(uuid);
		}

		officeScheduleImpl.setOfficeScheduleId(officeScheduleId);
		officeScheduleImpl.setGroupId(groupId);
		officeScheduleImpl.setCompanyId(companyId);
		officeScheduleImpl.setUserId(userId);

		if (userName == null) {
			officeScheduleImpl.setUserName("");
		}
		else {
			officeScheduleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			officeScheduleImpl.setCreateDate(null);
		}
		else {
			officeScheduleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			officeScheduleImpl.setModifiedDate(null);
		}
		else {
			officeScheduleImpl.setModifiedDate(new Date(modifiedDate));
		}

		officeScheduleImpl.setOfficeId(officeId);
		officeScheduleImpl.setSpots(spots);

		if (date == Long.MIN_VALUE) {
			officeScheduleImpl.setDate(null);
		}
		else {
			officeScheduleImpl.setDate(new Date(date));
		}

		officeScheduleImpl.resetOriginalValues();

		return officeScheduleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		officeScheduleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		officeId = objectInput.readLong();

		spots = objectInput.readInt();
		date = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(officeScheduleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(officeId);

		objectOutput.writeInt(spots);
		objectOutput.writeLong(date);
	}

	public String uuid;
	public long officeScheduleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long officeId;
	public int spots;
	public long date;

}