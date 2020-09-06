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

package blood0cean.com.github.office.schedule.service.persistence.impl;

import blood0cean.com.github.office.schedule.exception.NoSuchOfficeScheduleException;
import blood0cean.com.github.office.schedule.model.OfficeSchedule;
import blood0cean.com.github.office.schedule.model.impl.OfficeScheduleImpl;
import blood0cean.com.github.office.schedule.model.impl.OfficeScheduleModelImpl;
import blood0cean.com.github.office.schedule.service.persistence.OfficeSchedulePersistence;
import blood0cean.com.github.office.schedule.service.persistence.impl.constants.OFFICEPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the office schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Blood 0cean
 * @generated
 */
@Component(service = OfficeSchedulePersistence.class)
public class OfficeSchedulePersistenceImpl
	extends BasePersistenceImpl<OfficeSchedule>
	implements OfficeSchedulePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OfficeScheduleUtil</code> to access the office schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OfficeScheduleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the office schedules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching office schedules
	 */
	@Override
	public List<OfficeSchedule> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<OfficeSchedule> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<OfficeSchedule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<OfficeSchedule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<OfficeSchedule> list = null;

		if (useFinderCache) {
			list = (List<OfficeSchedule>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OfficeSchedule officeSchedule : list) {
					if (!uuid.equals(officeSchedule.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OfficeScheduleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<OfficeSchedule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule findByUuid_First(
			String uuid, OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByUuid_First(
			uuid, orderByComparator);

		if (officeSchedule != null) {
			return officeSchedule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOfficeScheduleException(sb.toString());
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUuid_First(
		String uuid, OrderByComparator<OfficeSchedule> orderByComparator) {

		List<OfficeSchedule> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule findByUuid_Last(
			String uuid, OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByUuid_Last(
			uuid, orderByComparator);

		if (officeSchedule != null) {
			return officeSchedule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOfficeScheduleException(sb.toString());
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUuid_Last(
		String uuid, OrderByComparator<OfficeSchedule> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OfficeSchedule> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public OfficeSchedule[] findByUuid_PrevAndNext(
			long officeScheduleId, String uuid,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		uuid = Objects.toString(uuid, "");

		OfficeSchedule officeSchedule = findByPrimaryKey(officeScheduleId);

		Session session = null;

		try {
			session = openSession();

			OfficeSchedule[] array = new OfficeScheduleImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, officeSchedule, uuid, orderByComparator, true);

			array[1] = officeSchedule;

			array[2] = getByUuid_PrevAndNext(
				session, officeSchedule, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OfficeSchedule getByUuid_PrevAndNext(
		Session session, OfficeSchedule officeSchedule, String uuid,
		OrderByComparator<OfficeSchedule> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(OfficeScheduleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						officeSchedule)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OfficeSchedule> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the office schedules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OfficeSchedule officeSchedule :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(officeSchedule);
		}
	}

	/**
	 * Returns the number of office schedules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching office schedules
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"officeSchedule.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(officeSchedule.uuid IS NULL OR officeSchedule.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule findByUUID_G(String uuid, long groupId)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByUUID_G(uuid, groupId);

		if (officeSchedule == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOfficeScheduleException(sb.toString());
		}

		return officeSchedule;
	}

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the office schedule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof OfficeSchedule) {
			OfficeSchedule officeSchedule = (OfficeSchedule)result;

			if (!Objects.equals(uuid, officeSchedule.getUuid()) ||
				(groupId != officeSchedule.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<OfficeSchedule> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OfficeSchedule officeSchedule = list.get(0);

					result = officeSchedule;

					cacheResult(officeSchedule);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OfficeSchedule)result;
		}
	}

	/**
	 * Removes the office schedule where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the office schedule that was removed
	 */
	@Override
	public OfficeSchedule removeByUUID_G(String uuid, long groupId)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = findByUUID_G(uuid, groupId);

		return remove(officeSchedule);
	}

	/**
	 * Returns the number of office schedules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching office schedules
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"officeSchedule.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(officeSchedule.uuid IS NULL OR officeSchedule.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"officeSchedule.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching office schedules
	 */
	@Override
	public List<OfficeSchedule> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<OfficeSchedule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<OfficeSchedule> list = null;

		if (useFinderCache) {
			list = (List<OfficeSchedule>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OfficeSchedule officeSchedule : list) {
					if (!uuid.equals(officeSchedule.getUuid()) ||
						(companyId != officeSchedule.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OfficeScheduleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<OfficeSchedule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public OfficeSchedule findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (officeSchedule != null) {
			return officeSchedule;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOfficeScheduleException(sb.toString());
	}

	/**
	 * Returns the first office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		List<OfficeSchedule> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public OfficeSchedule findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (officeSchedule != null) {
			return officeSchedule;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOfficeScheduleException(sb.toString());
	}

	/**
	 * Returns the last office schedule in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OfficeSchedule> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public OfficeSchedule[] findByUuid_C_PrevAndNext(
			long officeScheduleId, String uuid, long companyId,
			OrderByComparator<OfficeSchedule> orderByComparator)
		throws NoSuchOfficeScheduleException {

		uuid = Objects.toString(uuid, "");

		OfficeSchedule officeSchedule = findByPrimaryKey(officeScheduleId);

		Session session = null;

		try {
			session = openSession();

			OfficeSchedule[] array = new OfficeScheduleImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, officeSchedule, uuid, companyId, orderByComparator,
				true);

			array[1] = officeSchedule;

			array[2] = getByUuid_C_PrevAndNext(
				session, officeSchedule, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OfficeSchedule getByUuid_C_PrevAndNext(
		Session session, OfficeSchedule officeSchedule, String uuid,
		long companyId, OrderByComparator<OfficeSchedule> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(OfficeScheduleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						officeSchedule)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OfficeSchedule> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the office schedules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OfficeSchedule officeSchedule :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(officeSchedule);
		}
	}

	/**
	 * Returns the number of office schedules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching office schedules
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OFFICESCHEDULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"officeSchedule.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(officeSchedule.uuid IS NULL OR officeSchedule.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"officeSchedule.companyId = ?";

	private FinderPath _finderPathFetchByOffice;
	private FinderPath _finderPathCountByOffice;

	/**
	 * Returns the office schedule where officeId = &#63; or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param officeId the office ID
	 * @return the matching office schedule
	 * @throws NoSuchOfficeScheduleException if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule findByOffice(long officeId)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByOffice(officeId);

		if (officeSchedule == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("officeId=");
			sb.append(officeId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOfficeScheduleException(sb.toString());
		}

		return officeSchedule;
	}

	/**
	 * Returns the office schedule where officeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param officeId the office ID
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByOffice(long officeId) {
		return fetchByOffice(officeId, true);
	}

	/**
	 * Returns the office schedule where officeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param officeId the office ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching office schedule, or <code>null</code> if a matching office schedule could not be found
	 */
	@Override
	public OfficeSchedule fetchByOffice(long officeId, boolean useFinderCache) {
		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {officeId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByOffice, finderArgs, this);
		}

		if (result instanceof OfficeSchedule) {
			OfficeSchedule officeSchedule = (OfficeSchedule)result;

			if (officeId != officeSchedule.getOfficeId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OFFICESCHEDULE_WHERE);

			sb.append(_FINDER_COLUMN_OFFICE_OFFICEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(officeId);

				List<OfficeSchedule> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByOffice, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {officeId};
							}

							_log.warn(
								"OfficeSchedulePersistenceImpl.fetchByOffice(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OfficeSchedule officeSchedule = list.get(0);

					result = officeSchedule;

					cacheResult(officeSchedule);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByOffice, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OfficeSchedule)result;
		}
	}

	/**
	 * Removes the office schedule where officeId = &#63; from the database.
	 *
	 * @param officeId the office ID
	 * @return the office schedule that was removed
	 */
	@Override
	public OfficeSchedule removeByOffice(long officeId)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = findByOffice(officeId);

		return remove(officeSchedule);
	}

	/**
	 * Returns the number of office schedules where officeId = &#63;.
	 *
	 * @param officeId the office ID
	 * @return the number of matching office schedules
	 */
	@Override
	public int countByOffice(long officeId) {
		FinderPath finderPath = _finderPathCountByOffice;

		Object[] finderArgs = new Object[] {officeId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OFFICESCHEDULE_WHERE);

			sb.append(_FINDER_COLUMN_OFFICE_OFFICEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(officeId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_OFFICE_OFFICEID_2 =
		"officeSchedule.officeId = ?";

	public OfficeSchedulePersistenceImpl() {
		setModelClass(OfficeSchedule.class);

		setModelImplClass(OfficeScheduleImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the office schedule in the entity cache if it is enabled.
	 *
	 * @param officeSchedule the office schedule
	 */
	@Override
	public void cacheResult(OfficeSchedule officeSchedule) {
		entityCache.putResult(
			entityCacheEnabled, OfficeScheduleImpl.class,
			officeSchedule.getPrimaryKey(), officeSchedule);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				officeSchedule.getUuid(), officeSchedule.getGroupId()
			},
			officeSchedule);

		finderCache.putResult(
			_finderPathFetchByOffice,
			new Object[] {officeSchedule.getOfficeId()}, officeSchedule);

		officeSchedule.resetOriginalValues();
	}

	/**
	 * Caches the office schedules in the entity cache if it is enabled.
	 *
	 * @param officeSchedules the office schedules
	 */
	@Override
	public void cacheResult(List<OfficeSchedule> officeSchedules) {
		for (OfficeSchedule officeSchedule : officeSchedules) {
			if (entityCache.getResult(
					entityCacheEnabled, OfficeScheduleImpl.class,
					officeSchedule.getPrimaryKey()) == null) {

				cacheResult(officeSchedule);
			}
			else {
				officeSchedule.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all office schedules.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OfficeScheduleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the office schedule.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OfficeSchedule officeSchedule) {
		entityCache.removeResult(
			entityCacheEnabled, OfficeScheduleImpl.class,
			officeSchedule.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((OfficeScheduleModelImpl)officeSchedule, true);
	}

	@Override
	public void clearCache(List<OfficeSchedule> officeSchedules) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OfficeSchedule officeSchedule : officeSchedules) {
			entityCache.removeResult(
				entityCacheEnabled, OfficeScheduleImpl.class,
				officeSchedule.getPrimaryKey());

			clearUniqueFindersCache(
				(OfficeScheduleModelImpl)officeSchedule, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, OfficeScheduleImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OfficeScheduleModelImpl officeScheduleModelImpl) {

		Object[] args = new Object[] {
			officeScheduleModelImpl.getUuid(),
			officeScheduleModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, officeScheduleModelImpl, false);

		args = new Object[] {officeScheduleModelImpl.getOfficeId()};

		finderCache.putResult(
			_finderPathCountByOffice, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByOffice, args, officeScheduleModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		OfficeScheduleModelImpl officeScheduleModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				officeScheduleModelImpl.getUuid(),
				officeScheduleModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((officeScheduleModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				officeScheduleModelImpl.getOriginalUuid(),
				officeScheduleModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				officeScheduleModelImpl.getOfficeId()
			};

			finderCache.removeResult(_finderPathCountByOffice, args);
			finderCache.removeResult(_finderPathFetchByOffice, args);
		}

		if ((officeScheduleModelImpl.getColumnBitmask() &
			 _finderPathFetchByOffice.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				officeScheduleModelImpl.getOriginalOfficeId()
			};

			finderCache.removeResult(_finderPathCountByOffice, args);
			finderCache.removeResult(_finderPathFetchByOffice, args);
		}
	}

	/**
	 * Creates a new office schedule with the primary key. Does not add the office schedule to the database.
	 *
	 * @param officeScheduleId the primary key for the new office schedule
	 * @return the new office schedule
	 */
	@Override
	public OfficeSchedule create(long officeScheduleId) {
		OfficeSchedule officeSchedule = new OfficeScheduleImpl();

		officeSchedule.setNew(true);
		officeSchedule.setPrimaryKey(officeScheduleId);

		String uuid = PortalUUIDUtil.generate();

		officeSchedule.setUuid(uuid);

		officeSchedule.setCompanyId(CompanyThreadLocal.getCompanyId());

		return officeSchedule;
	}

	/**
	 * Removes the office schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule that was removed
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	@Override
	public OfficeSchedule remove(long officeScheduleId)
		throws NoSuchOfficeScheduleException {

		return remove((Serializable)officeScheduleId);
	}

	/**
	 * Removes the office schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the office schedule
	 * @return the office schedule that was removed
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	@Override
	public OfficeSchedule remove(Serializable primaryKey)
		throws NoSuchOfficeScheduleException {

		Session session = null;

		try {
			session = openSession();

			OfficeSchedule officeSchedule = (OfficeSchedule)session.get(
				OfficeScheduleImpl.class, primaryKey);

			if (officeSchedule == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOfficeScheduleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(officeSchedule);
		}
		catch (NoSuchOfficeScheduleException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected OfficeSchedule removeImpl(OfficeSchedule officeSchedule) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(officeSchedule)) {
				officeSchedule = (OfficeSchedule)session.get(
					OfficeScheduleImpl.class,
					officeSchedule.getPrimaryKeyObj());
			}

			if (officeSchedule != null) {
				session.delete(officeSchedule);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (officeSchedule != null) {
			clearCache(officeSchedule);
		}

		return officeSchedule;
	}

	@Override
	public OfficeSchedule updateImpl(OfficeSchedule officeSchedule) {
		boolean isNew = officeSchedule.isNew();

		if (!(officeSchedule instanceof OfficeScheduleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(officeSchedule.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					officeSchedule);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in officeSchedule proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OfficeSchedule implementation " +
					officeSchedule.getClass());
		}

		OfficeScheduleModelImpl officeScheduleModelImpl =
			(OfficeScheduleModelImpl)officeSchedule;

		if (Validator.isNull(officeSchedule.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			officeSchedule.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (officeSchedule.getCreateDate() == null)) {
			if (serviceContext == null) {
				officeSchedule.setCreateDate(now);
			}
			else {
				officeSchedule.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!officeScheduleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				officeSchedule.setModifiedDate(now);
			}
			else {
				officeSchedule.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (officeSchedule.isNew()) {
				session.save(officeSchedule);

				officeSchedule.setNew(false);
			}
			else {
				officeSchedule = (OfficeSchedule)session.merge(officeSchedule);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {officeScheduleModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				officeScheduleModelImpl.getUuid(),
				officeScheduleModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((officeScheduleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					officeScheduleModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {officeScheduleModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((officeScheduleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					officeScheduleModelImpl.getOriginalUuid(),
					officeScheduleModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					officeScheduleModelImpl.getUuid(),
					officeScheduleModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, OfficeScheduleImpl.class,
			officeSchedule.getPrimaryKey(), officeSchedule, false);

		clearUniqueFindersCache(officeScheduleModelImpl, false);
		cacheUniqueFindersCache(officeScheduleModelImpl);

		officeSchedule.resetOriginalValues();

		return officeSchedule;
	}

	/**
	 * Returns the office schedule with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the office schedule
	 * @return the office schedule
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	@Override
	public OfficeSchedule findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOfficeScheduleException {

		OfficeSchedule officeSchedule = fetchByPrimaryKey(primaryKey);

		if (officeSchedule == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOfficeScheduleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return officeSchedule;
	}

	/**
	 * Returns the office schedule with the primary key or throws a <code>NoSuchOfficeScheduleException</code> if it could not be found.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule
	 * @throws NoSuchOfficeScheduleException if a office schedule with the primary key could not be found
	 */
	@Override
	public OfficeSchedule findByPrimaryKey(long officeScheduleId)
		throws NoSuchOfficeScheduleException {

		return findByPrimaryKey((Serializable)officeScheduleId);
	}

	/**
	 * Returns the office schedule with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officeScheduleId the primary key of the office schedule
	 * @return the office schedule, or <code>null</code> if a office schedule with the primary key could not be found
	 */
	@Override
	public OfficeSchedule fetchByPrimaryKey(long officeScheduleId) {
		return fetchByPrimaryKey((Serializable)officeScheduleId);
	}

	/**
	 * Returns all the office schedules.
	 *
	 * @return the office schedules
	 */
	@Override
	public List<OfficeSchedule> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<OfficeSchedule> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<OfficeSchedule> findAll(
		int start, int end,
		OrderByComparator<OfficeSchedule> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<OfficeSchedule> findAll(
		int start, int end, OrderByComparator<OfficeSchedule> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<OfficeSchedule> list = null;

		if (useFinderCache) {
			list = (List<OfficeSchedule>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OFFICESCHEDULE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OFFICESCHEDULE;

				sql = sql.concat(OfficeScheduleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OfficeSchedule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the office schedules from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OfficeSchedule officeSchedule : findAll()) {
			remove(officeSchedule);
		}
	}

	/**
	 * Returns the number of office schedules.
	 *
	 * @return the number of office schedules
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OFFICESCHEDULE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "officeScheduleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OFFICESCHEDULE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OfficeScheduleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the office schedule persistence.
	 */
	@Activate
	public void activate() {
		OfficeScheduleModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		OfficeScheduleModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			OfficeScheduleModelImpl.UUID_COLUMN_BITMASK |
			OfficeScheduleModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			OfficeScheduleModelImpl.UUID_COLUMN_BITMASK |
			OfficeScheduleModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			OfficeScheduleModelImpl.UUID_COLUMN_BITMASK |
			OfficeScheduleModelImpl.COMPANYID_COLUMN_BITMASK |
			OfficeScheduleModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathFetchByOffice = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, OfficeScheduleImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOffice",
			new String[] {Long.class.getName()},
			OfficeScheduleModelImpl.OFFICEID_COLUMN_BITMASK);

		_finderPathCountByOffice = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOffice",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(OfficeScheduleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = OFFICEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.blood0cean.com.github.office.schedule.model.OfficeSchedule"),
			true);
	}

	@Override
	@Reference(
		target = OFFICEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OFFICEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OFFICESCHEDULE =
		"SELECT officeSchedule FROM OfficeSchedule officeSchedule";

	private static final String _SQL_SELECT_OFFICESCHEDULE_WHERE =
		"SELECT officeSchedule FROM OfficeSchedule officeSchedule WHERE ";

	private static final String _SQL_COUNT_OFFICESCHEDULE =
		"SELECT COUNT(officeSchedule) FROM OfficeSchedule officeSchedule";

	private static final String _SQL_COUNT_OFFICESCHEDULE_WHERE =
		"SELECT COUNT(officeSchedule) FROM OfficeSchedule officeSchedule WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "officeSchedule.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OfficeSchedule exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OfficeSchedule exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OfficeSchedulePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "date"});

	static {
		try {
			Class.forName(OFFICEPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}