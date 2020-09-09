create index IX_BE9462E4 on OFFICE_Office (active_);
create index IX_59FA6885 on OFFICE_Office (groupId);
create index IX_9BD661C4 on OFFICE_Office (name[$COLUMN_LENGTH:75$]);
create index IX_1CBAB479 on OFFICE_Office (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C028053B on OFFICE_Office (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EB51B6E7 on OFFICE_OfficeSchedule (officeId);
create index IX_427F7AB0 on OFFICE_OfficeSchedule (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E206ED32 on OFFICE_OfficeSchedule (uuid_[$COLUMN_LENGTH:75$], groupId);