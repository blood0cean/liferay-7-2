create table OFFICE_Office (
	uuid_ VARCHAR(75) null,
	officeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	active_ BOOLEAN,
	maxPeopleAllowed INTEGER,
	availableFrom DATE null,
	availableUntil DATE null
);

create table OFFICE_OfficeSchedule (
	uuid_ VARCHAR(75) null,
	officeScheduleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	officeId LONG,
	spots INTEGER,
	date_ DATE null
);