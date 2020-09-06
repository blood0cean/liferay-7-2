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
 * Provides a wrapper for {@link OfficeScheduleService}.
 *
 * @author Blood 0cean
 * @see OfficeScheduleService
 * @generated
 */
public class OfficeScheduleServiceWrapper
	implements OfficeScheduleService, ServiceWrapper<OfficeScheduleService> {

	public OfficeScheduleServiceWrapper(
		OfficeScheduleService officeScheduleService) {

		_officeScheduleService = officeScheduleService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _officeScheduleService.getOSGiServiceIdentifier();
	}

	@Override
	public OfficeScheduleService getWrappedService() {
		return _officeScheduleService;
	}

	@Override
	public void setWrappedService(OfficeScheduleService officeScheduleService) {
		_officeScheduleService = officeScheduleService;
	}

	private OfficeScheduleService _officeScheduleService;

}