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
 * Provides the remote service utility for OfficeSchedule. This utility wraps
 * <code>blood0cean.com.github.office.schedule.service.impl.OfficeScheduleServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Blood 0cean
 * @see OfficeScheduleService
 * @generated
 */
public class OfficeScheduleServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>blood0cean.com.github.office.schedule.service.impl.OfficeScheduleServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OfficeScheduleService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OfficeScheduleService, OfficeScheduleService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OfficeScheduleService.class);

		ServiceTracker<OfficeScheduleService, OfficeScheduleService>
			serviceTracker =
				new ServiceTracker
					<OfficeScheduleService, OfficeScheduleService>(
						bundle.getBundleContext(), OfficeScheduleService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}