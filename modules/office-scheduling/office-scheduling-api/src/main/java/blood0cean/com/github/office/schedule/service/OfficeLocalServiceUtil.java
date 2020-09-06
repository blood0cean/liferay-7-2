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
 * Provides the local service utility for Office. This utility wraps
 * <code>blood0cean.com.github.office.schedule.service.impl.OfficeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Blood 0cean
 * @see OfficeLocalService
 * @generated
 */
public class OfficeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>blood0cean.com.github.office.schedule.service.impl.OfficeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the office to the database. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was added
	 */
	public static blood0cean.com.github.office.schedule.model.Office addOffice(
		blood0cean.com.github.office.schedule.model.Office office) {

		return getService().addOffice(office);
	}

	/**
	 * Creates a new office with the primary key. Does not add the office to the database.
	 *
	 * @param officeId the primary key for the new office
	 * @return the new office
	 */
	public static blood0cean.com.github.office.schedule.model.Office
		createOffice(long officeId) {

		return getService().createOffice(officeId);
	}

	/**
	 * Deletes the office with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeId the primary key of the office
	 * @return the office that was removed
	 * @throws PortalException if a office with the primary key could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.Office
			deleteOffice(long officeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOffice(officeId);
	}

	/**
	 * Deletes the office from the database. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was removed
	 */
	public static blood0cean.com.github.office.schedule.model.Office
		deleteOffice(
			blood0cean.com.github.office.schedule.model.Office office) {

		return getService().deleteOffice(office);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
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

	public static blood0cean.com.github.office.schedule.model.Office
		fetchOffice(long officeId) {

		return getService().fetchOffice(officeId);
	}

	/**
	 * Returns the office matching the UUID and group.
	 *
	 * @param uuid the office's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.Office
		fetchOfficeByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchOfficeByUuidAndGroupId(uuid, groupId);
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
	 * Returns the office with the primary key.
	 *
	 * @param officeId the primary key of the office
	 * @return the office
	 * @throws PortalException if a office with the primary key could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.Office getOffice(
			long officeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOffice(officeId);
	}

	/**
	 * Returns the office matching the UUID and group.
	 *
	 * @param uuid the office's UUID
	 * @param groupId the primary key of the group
	 * @return the matching office
	 * @throws PortalException if a matching office could not be found
	 */
	public static blood0cean.com.github.office.schedule.model.Office
			getOfficeByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOfficeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the offices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of offices
	 */
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.Office> getOffices(
			int start, int end) {

		return getService().getOffices(start, end);
	}

	/**
	 * Returns all the offices matching the UUID and company.
	 *
	 * @param uuid the UUID of the offices
	 * @param companyId the primary key of the company
	 * @return the matching offices, or an empty list if no matches were found
	 */
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.Office>
			getOfficesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOfficesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of offices matching the UUID and company.
	 *
	 * @param uuid the UUID of the offices
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching offices, or an empty list if no matches were found
	 */
	public static java.util.List
		<blood0cean.com.github.office.schedule.model.Office>
			getOfficesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<blood0cean.com.github.office.schedule.model.Office>
						orderByComparator) {

		return getService().getOfficesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of offices.
	 *
	 * @return the number of offices
	 */
	public static int getOfficesCount() {
		return getService().getOfficesCount();
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
	 * Updates the office in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param office the office
	 * @return the office that was updated
	 */
	public static blood0cean.com.github.office.schedule.model.Office
		updateOffice(
			blood0cean.com.github.office.schedule.model.Office office) {

		return getService().updateOffice(office);
	}

	public static OfficeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OfficeLocalService, OfficeLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OfficeLocalService.class);

		ServiceTracker<OfficeLocalService, OfficeLocalService> serviceTracker =
			new ServiceTracker<OfficeLocalService, OfficeLocalService>(
				bundle.getBundleContext(), OfficeLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}