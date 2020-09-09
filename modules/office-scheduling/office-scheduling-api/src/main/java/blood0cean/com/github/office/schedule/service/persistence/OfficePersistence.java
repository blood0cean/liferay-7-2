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

import blood0cean.com.github.office.schedule.exception.NoSuchOfficeException;
import blood0cean.com.github.office.schedule.model.Office;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the office service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Blood 0cean
 * @see OfficeUtil
 * @generated
 */
@ProviderType
public interface OfficePersistence extends BasePersistence<Office> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfficeUtil} to access the office persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the offices where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching offices
	 */
	public java.util.List<Office> findByUuid(String uuid);

	/**
	 * Returns a range of all the offices where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of matching offices
	 */
	public java.util.List<Office> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the offices where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offices where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first office in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the first office in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the last office in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the last office in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the offices before and after the current office in the ordered set where uuid = &#63;.
	 *
	 * @param officeId the primary key of the current office
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office[] findByUuid_PrevAndNext(
			long officeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Removes all the offices where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of offices where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching offices
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the office where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOfficeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByUUID_G(String uuid, long groupId)
		throws NoSuchOfficeException;

	/**
	 * Returns the office where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the office where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the office where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the office that was removed
	 */
	public Office removeByUUID_G(String uuid, long groupId)
		throws NoSuchOfficeException;

	/**
	 * Returns the number of offices where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching offices
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the offices where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching offices
	 */
	public java.util.List<Office> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the offices where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of matching offices
	 */
	public java.util.List<Office> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the offices where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offices where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first office in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the first office in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the last office in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the last office in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the offices before and after the current office in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param officeId the primary key of the current office
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office[] findByUuid_C_PrevAndNext(
			long officeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Removes all the offices where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of offices where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching offices
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the offices where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching offices
	 */
	public java.util.List<Office> findByGroupId(long groupId);

	/**
	 * Returns a range of all the offices where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of matching offices
	 */
	public java.util.List<Office> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the offices where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offices where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first office in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the first office in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the last office in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the last office in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the offices before and after the current office in the ordered set where groupId = &#63;.
	 *
	 * @param officeId the primary key of the current office
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office[] findByGroupId_PrevAndNext(
			long officeId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Removes all the offices where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of offices where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching offices
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the office where name = &#63; or throws a <code>NoSuchOfficeException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByName(String name) throws NoSuchOfficeException;

	/**
	 * Returns the office where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByName(String name);

	/**
	 * Returns the office where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the office where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the office that was removed
	 */
	public Office removeByName(String name) throws NoSuchOfficeException;

	/**
	 * Returns the number of offices where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching offices
	 */
	public int countByName(String name);

	/**
	 * Returns all the offices where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching offices
	 */
	public java.util.List<Office> findByActive(boolean active);

	/**
	 * Returns a range of all the offices where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of matching offices
	 */
	public java.util.List<Office> findByActive(
		boolean active, int start, int end);

	/**
	 * Returns an ordered range of all the offices where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByActive(
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offices where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching offices
	 */
	public java.util.List<Office> findByActive(
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first office in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByActive_First(
			boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the first office in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByActive_First(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the last office in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office
	 * @throws NoSuchOfficeException if a matching office could not be found
	 */
	public Office findByActive_Last(
			boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Returns the last office in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office, or <code>null</code> if a matching office could not be found
	 */
	public Office fetchByActive_Last(
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns the offices before and after the current office in the ordered set where active = &#63;.
	 *
	 * @param officeId the primary key of the current office
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next office
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office[] findByActive_PrevAndNext(
			long officeId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<Office>
				orderByComparator)
		throws NoSuchOfficeException;

	/**
	 * Removes all the offices where active = &#63; from the database.
	 *
	 * @param active the active
	 */
	public void removeByActive(boolean active);

	/**
	 * Returns the number of offices where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching offices
	 */
	public int countByActive(boolean active);

	/**
	 * Caches the office in the entity cache if it is enabled.
	 *
	 * @param office the office
	 */
	public void cacheResult(Office office);

	/**
	 * Caches the offices in the entity cache if it is enabled.
	 *
	 * @param offices the offices
	 */
	public void cacheResult(java.util.List<Office> offices);

	/**
	 * Creates a new office with the primary key. Does not add the office to the database.
	 *
	 * @param officeId the primary key for the new office
	 * @return the new office
	 */
	public Office create(long officeId);

	/**
	 * Removes the office with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeId the primary key of the office
	 * @return the office that was removed
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office remove(long officeId) throws NoSuchOfficeException;

	public Office updateImpl(Office office);

	/**
	 * Returns the office with the primary key or throws a <code>NoSuchOfficeException</code> if it could not be found.
	 *
	 * @param officeId the primary key of the office
	 * @return the office
	 * @throws NoSuchOfficeException if a office with the primary key could not be found
	 */
	public Office findByPrimaryKey(long officeId) throws NoSuchOfficeException;

	/**
	 * Returns the office with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officeId the primary key of the office
	 * @return the office, or <code>null</code> if a office with the primary key could not be found
	 */
	public Office fetchByPrimaryKey(long officeId);

	/**
	 * Returns all the offices.
	 *
	 * @return the offices
	 */
	public java.util.List<Office> findAll();

	/**
	 * Returns a range of all the offices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @return the range of offices
	 */
	public java.util.List<Office> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the offices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of offices
	 */
	public java.util.List<Office> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offices
	 * @param end the upper bound of the range of offices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of offices
	 */
	public java.util.List<Office> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Office>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the offices from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of offices.
	 *
	 * @return the number of offices
	 */
	public int countAll();

}