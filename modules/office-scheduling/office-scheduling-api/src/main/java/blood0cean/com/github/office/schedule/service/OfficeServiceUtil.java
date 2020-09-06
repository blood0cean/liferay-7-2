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
 * Provides the remote service utility for Office. This utility wraps
 * <code>blood0cean.com.github.office.schedule.service.impl.OfficeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Blood 0cean
 * @see OfficeService
 * @generated
 */
public class OfficeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>blood0cean.com.github.office.schedule.service.impl.OfficeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OfficeService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OfficeService, OfficeService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OfficeService.class);

		ServiceTracker<OfficeService, OfficeService> serviceTracker =
			new ServiceTracker<OfficeService, OfficeService>(
				bundle.getBundleContext(), OfficeService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}