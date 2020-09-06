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

package blood0cean.com.github.office.schedule.service.persistence;

import blood0cean.com.github.office.schedule.model.OfficeSchedule;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the office schedule service. This utility wraps <code>blood0cean.com.github.office.schedule.service.persistence.impl.OfficeSchedulePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Blood 0cean
 * @see OfficeSchedulePersistence
 * @generated
 */
public class OfficeScheduleUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(OfficeSchedule officeSchedule) {
		getPersistence().clearCache(officeSchedule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, OfficeSchedule> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OfficeSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OfficeSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OfficeSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OfficeSchedule update(OfficeSchedule officeSchedule) {
		return getPersistence().update(officeSchedule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OfficeSchedule update(
		OfficeSchedule officeSchedule, ServiceContext serviceContext) {

		return getPersistence().update(officeSchedule, serviceContext);
	}

	/**
	 * Returns all the office schedules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the office schedules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @return the range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the office schedules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the office schedules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByUuid_First(
			String uuid, OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUuid_First(
		String uuid, OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByUuid_Last(
			String uuid, OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUuid_Last(
		String uuid, OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the office schedules before and after the current office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param officeScheduleId the primary key of the current office schedule
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office schedule
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	public static OfficeSchedule[] findByUuid_PrevAndNext(
			long officeScheduleId, String uuid,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_PrevAndNext(
			officeScheduleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the office schedules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of office schedules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching office schedules
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByUUID_G(String uuid, long groupId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the office schedule where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the office schedule that was removed
	 */
	public static OfficeSchedule removeByUUID_G(String uuid, long groupId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of office schedules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching office schedules
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @return the range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching office schedules
	 */
	public static List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the office schedules before and after the current office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param officeScheduleId the primary key of the current office schedule
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office schedule
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	public static OfficeSchedule[] findByUuid_C_PrevAndNext(
			long officeScheduleId, String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByUuid_C_PrevAndNext(
			officeScheduleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the office schedules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching office schedules
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the office schedule where officeId = &#63; or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param officeId the office ID
	 * @return the matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	public static OfficeSchedule findByOffice(long officeId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByOffice(officeId);
	}

	/**
	 * Returns the office schedule where officeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param officeId the office ID
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByOffice(long officeId) {
		return getPersistence().fetchByOffice(officeId);
	}

	/**
	 * Returns the office schedule where officeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param officeId the office ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	public static OfficeSchedule fetchByOffice(
		long officeId, boolean useFinderCache) {

		return getPersistence().fetchByOffice(officeId, useFinderCache);
	}

	/**
	 * Removes the office schedule where officeId = &#63; from the database.
	 *
	 * @param officeId the office ID
	 * @return the office schedule that was removed
	 */
	public static OfficeSchedule removeByOffice(long officeId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().removeByOffice(officeId);
	}

	/**
	 * Returns the number of office schedules where officeId = &#63;.
	 *
	 * @param officeId the office ID
	 * @return the number of matching office schedules
	 */
	public static int countByOffice(long officeId) {
		return getPersistence().countByOffice(officeId);
	}

	/**
	 * Caches the office schedule in the entity cache if it is enabled.
	 *
	 * @param officeSchedule the office schedule
	 */
	public static void cacheResult(OfficeSchedule officeSchedule) {
		getPersistence().cacheResult(officeSchedule);
	}

	/**
	 * Caches the office schedules in the entity cache if it is enabled.
	 *
	 * @param officeSchedules the office schedules
	 */
	public static void cacheResult(List<OfficeSchedule> officeSchedules) {
		getPersistence().cacheResult(officeSchedules);
	}

	/**
	 * Creates a new office schedule with the primary key. Does not add the office schedule to the database.
	 *
	 * @param officeScheduleId the primary key for the new office schedule
	 * @return the new office schedule
	 */
	public static OfficeSchedule create(long officeScheduleId) {
		return getPersistence().create(officeScheduleId);
	}

	/**
	 * Removes the office schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule that was removed
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	public static OfficeSchedule remove(long officeScheduleId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().remove(officeScheduleId);
	}

	public static OfficeSchedule updateImpl(OfficeSchedule officeSchedule) {
		return getPersistence().updateImpl(officeSchedule);
	}

	/**
	 * Returns the office schedule with the primary key or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	public static OfficeSchedule findByPrimaryKey(long officeScheduleId)
		throws blood0cean.com.github.office.schedule.exception.
			NoSuchOfficeScheduleException {

		return getPersistence().findByPrimaryKey(officeScheduleId);
	}

	/**
	 * Returns the office schedule with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule, or <code>null</code> if a office schedule with the primary key could not be found
	 */
	public static OfficeSchedule fetchByPrimaryKey(long officeScheduleId) {
		return getPersistence().fetchByPrimaryKey(officeScheduleId);
	}

	/**
	 * Returns all the office schedules.
	 *
	 * @return the office schedules
	 */
	public static List<OfficeSchedule> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the office schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @return the range of office schedules
	 */
	public static List<OfficeSchedule> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the office schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of office schedules
	 */
	public static List<OfficeSchedule> findAll(
		int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the office schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeScheduleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of office schedules
	 * @param end the upper bound of the range of office schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of office schedules
	 */
	public static List<OfficeSchedule> findAll(
		int start, int end, OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the office schedules from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of office schedules.
	 *
	 * @return the number of office schedules
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OfficeSchedulePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OfficeSchedulePersistence, OfficeSchedulePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			OfficeSchedulePersistence.class);

		ServiceTracker<OfficeSchedulePersistence, OfficeSchedulePersistence>
			serviceTracker =
				new ServiceTracker
					<OfficeSchedulePersistence, OfficeSchedulePersistence>(
						bundle.getBundleContext(),
						OfficeSchedulePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}