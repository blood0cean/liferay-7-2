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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for OfficeSchedule. This utility wraps
 * <code>blood0cean.com.github.office.schedule.service.impl.OfficeScheduleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Blood 0cean
 * @see OfficeScheduleLocalService
 * @generated
 */
public class OfficeScheduleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>blood0cean.com.github.office.schedule.service.impl.OfficeScheduleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the office schedule to the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was added
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		addOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return getService().addOfficeSchedule(officeSchedule);
	}

	/**
	 * Creates a new office schedule with the primary key. Does not add the office schedule to the database.
	 *
	 * @param officeScheduleId the primary key for the new office schedule
	 * @return the new office schedule
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		createOfficeSchedule(long officeScheduleId) {

		return getService().createOfficeSchedule(officeScheduleId);
	}

	/**
	 * Deletes the office schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule that was removed
	 * @throws PortalException if a office schedule with the primary key could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
			deleteOfficeSchedule(long officeScheduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOfficeSchedule(officeScheduleId);
	}

	/**
	 * Deletes the office schedule from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was removed
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		deleteOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return getService().deleteOfficeSchedule(officeSchedule);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		fetchOfficeSchedule(long officeScheduleId) {

		return getService().fetchOfficeSchedule(officeScheduleId);
	}

	/**
	 * Returns the office schedule matching the UUID and group.
	 *
	 * @param uuid the office schedule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		fetchOfficeScheduleByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchOfficeScheduleByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the office schedule with the primary key.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule
	 * @throws PortalException if a office schedule with the primary key could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
			getOfficeSchedule(long officeScheduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOfficeSchedule(officeScheduleId);
	}

	/**
	 * Returns the office schedule matching the UUID and group.
	 *
	 * @param uuid the office schedule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office schedule
	 * @throws PortalException if a matching office schedule could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
			getOfficeScheduleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOfficeScheduleByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedules(int start, int end) {

		return getService().getOfficeSchedules(start, end);
	}

	/**
	 * Returns all the office schedules matching the UUID and company.
	 *
	 * @param uuid the UUID of the office schedules
	 * @param companyId the primary key of the company
	 * @return the matching office schedules, or an empty list if no matches were found
	 */
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedulesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOfficeSchedulesByUuidAndCompanyId(
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
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.OfficeSchedule>
			getOfficeSchedulesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<blood0cean.com.github.office.schedule.model.OfficeSchedule>
						orderByComparator) {

		return getService().getOfficeSchedulesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of office schedules.
	 *
	 * @return the number of office schedules
	 */
	public static int getOfficeSchedulesCount() {
		return getService().getOfficeSchedulesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the office schedule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param officeSchedule the office schedule
	 * @return the office schedule that was updated
	 */
	public static blood0cean.com.github.office.schedule.model.OfficeSchedule
		updateOfficeSchedule(
			blood0cean.com.github.office.schedule.model.OfficeSchedule
				officeSchedule) {

		return getService().updateOfficeSchedule(officeSchedule);
	}

	public static OfficeScheduleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OfficeScheduleLocalService, OfficeScheduleLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			OfficeScheduleLocalService.class);

		ServiceTracker<OfficeScheduleLocalService, OfficeScheduleLocalService>
			serviceTracker =
				new ServiceTracker
					<OfficeScheduleLocalService, OfficeScheduleLocalService>(
						bundle.getBundleContext(),
						OfficeScheduleLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}