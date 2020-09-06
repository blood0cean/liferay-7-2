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
 * Provides a wrapper for {@link OfficeService}.
 *
 * @author Blood 0cean
 * @see OfficeService
 * @generated
 */
public class OfficeServiceWrapper
	implements OfficeService, ServiceWrapper<OfficeService> {

	public OfficeServiceWrapper(OfficeService officeService) {
		_officeService = officeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _officeService.getOSGiServiceIdentifier();
	}

	@Override
	public OfficeService getWrappedService() {
		return _officeService;
	}

	@Override
	public void setWrappedService(OfficeService officeService) {
		_officeService = officeService;
	}

	private OfficeService _officeService;

}