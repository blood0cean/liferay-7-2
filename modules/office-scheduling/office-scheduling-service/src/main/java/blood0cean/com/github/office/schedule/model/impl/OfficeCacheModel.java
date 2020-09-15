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

import blood0cean.com.github.office.schedule.model.Office;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Office in entity cache.
 *
 * @author Blood 0cean
 * @generated
 */
public class OfficeCacheModel implements CacheModel<Office>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfficeCacheModel)) {
			return false;
		}

		OfficeCacheModel officeCacheModel = (OfficeCacheModel)obj;

		if (officeId == officeCacheModel.officeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, officeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", officeId=");
		sb.append(officeId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", active=");
		sb.append(active);
		sb.append(", maxPeopleAllowed=");
		sb.append(maxPeopleAllowed);
		sb.append(", weekOpenDays=");
		sb.append(weekOpenDays);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Office toEntityModel() {
		OfficeImpl officeImpl = new OfficeImpl();

		if (uuid == null) {
			officeImpl.setUuid("");
		}
		else {
			officeImpl.setUuid(uuid);
		}

		officeImpl.setOfficeId(officeId);
		officeImpl.setGroupId(groupId);
		officeImpl.setCompanyId(companyId);
		officeImpl.setUserId(userId);

		if (userName == null) {
			officeImpl.setUserName("");
		}
		else {
			officeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			officeImpl.setCreateDate(null);
		}
		else {
			officeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			officeImpl.setModifiedDate(null);
		}
		else {
			officeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			officeImpl.setName("");
		}
		else {
			officeImpl.setName(name);
		}

		if (description == null) {
			officeImpl.setDescription("");
		}
		else {
			officeImpl.setDescription(description);
		}

		officeImpl.setActive(active);
		officeImpl.setMaxPeopleAllowed(maxPeopleAllowed);

		if (weekOpenDays == null) {
			officeImpl.setWeekOpenDays("");
		}
		else {
			officeImpl.setWeekOpenDays(weekOpenDays);
		}

		officeImpl.resetOriginalValues();

		return officeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		officeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		active = objectInput.readBoolean();

		maxPeopleAllowed = objectInput.readInt();
		weekOpenDays = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(officeId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeBoolean(active);

		objectOutput.writeInt(maxPeopleAllowed);

		if (weekOpenDays == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(weekOpenDays);
		}
	}

	public String uuid;
	public long officeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public boolean active;
	public int maxPeopleAllowed;
	public String weekOpenDays;

}