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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OfficeScheduleLocalService}.
 *
 * @author Blood 0cean
 * @see OfficeScheduleLocalService
 * @generated
 */
public class OfficeScheduleLocalServiceWrapper
	implements OfficeScheduleLocalService,
			   ServiceWrapper<OfficeScheduleLocalService> {

	public OfficeScheduleLocalServiceWrapper(
		OfficeScheduleLocalService officeScheduleLocalService) {

		_officeScheduleLocalService = officeScheduleLocalService;
	}

	/**
	 * Adds the office schedule to the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was added
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		addOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return _officeScheduleLocalService.addOfficeSchedule(officeSchedule);
	}

	/**
	 * Creates a new office schedule with the primary key. Does not add the office schedule to the database.
	 *
	 * @param officeScheduleId the primary key for the new office schedule
	 * @return the new office schedule
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		createOfficeSchedule(long officeScheduleId) {

		return _officeScheduleLocalService.createOfficeSchedule(
			officeScheduleId);
	}

	/**
	 * Deletes the office schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule that was removed
	 * @throws PortalException if a office schedule with the primary key could not be found
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
			deleteOfficeSchedule(long officeScheduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officeScheduleLocalService.deleteOfficeSchedule(
			officeScheduleId);
	}

	/**
	 * Deletes the office schedule from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was removed
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		deleteOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return _officeScheduleLocalService.deleteOfficeSchedule(officeSchedule);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officeScheduleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _officeScheduleLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _officeScheduleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _officeScheduleLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _officeScheduleLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _officeScheduleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _officeScheduleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		fetchOfficeSchedule(long officeScheduleId) {

		return _officeScheduleLocalService.fetchOfficeSchedule(
			officeScheduleId);
	}

	/**
	 * Returns the office schedule matching the UUID and group.
	 *
	 * @param uuid the office schedule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		fetchOfficeScheduleByUuidAndGroupId(String uuid, long groupId) {

		return _officeScheduleLocalService.fetchOfficeScheduleByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _officeScheduleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _officeScheduleLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _officeScheduleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the office schedule with the primary key.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule
	 * @throws PortalException if a office schedule with the primary key could not be found
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
			getOfficeSchedule(long officeScheduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officeScheduleLocalService.getOfficeSchedule(officeScheduleId);
	}

	/**
	 * Returns the office schedule matching the UUID and group.
	 *
	 * @param uuid the office schedule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office schedule
	 * @throws PortalException if a matching office schedule could not be found
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
			getOfficeScheduleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officeScheduleLocalService.getOfficeScheduleByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the office schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @return the range of office schedules
	 */
	@Override
	public java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedules(int start, int end) {

		return _officeScheduleLocalService.getOfficeSchedules(start, end);
	}

	/**
	 * Returns all the office schedules matching the UUID and company.
	 *
	 * @param uuid the UUID of the office schedules
	 * @param companyId the primary key of the company
	 * @return the matching office schedules, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedulesByUuidAndCompanyId(String uuid, long companyId) {

		return _officeScheduleLocalService.getOfficeSchedulesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of office schedules matching the UUID and company.
	 *
	 * @param uuid the UUID of the office schedules
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching office schedules, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedulesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<blood0cean.com.github.office.schedule.model.OfficeSchedule>
						orderByComparator) {

		return _officeScheduleLocalService.getOfficeSchedulesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of office schedules.
	 *
	 * @return the number of office schedules
	 */
	@Override
	public int getOfficeSchedulesCount() {
		return _officeScheduleLocalService.getOfficeSchedulesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _officeScheduleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officeScheduleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the office schedule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was updated
	 */
	@Override
	public blood0cean.com.github.office.schedule.model.OfficeSchedule
		updateOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return _officeScheduleLocalService.updateOfficeSchedule(officeSchedule);
	}

	@Override
	public OfficeScheduleLocalService getWrappedService() {
		return _officeScheduleLocalService;
	}

	@Override
	public void setWrappedService(
		OfficeScheduleLocalService officeScheduleLocalService) {

		_officeScheduleLocalService = officeScheduleLocalService;
	}

	private OfficeScheduleLocalService _officeScheduleLocalService;

}