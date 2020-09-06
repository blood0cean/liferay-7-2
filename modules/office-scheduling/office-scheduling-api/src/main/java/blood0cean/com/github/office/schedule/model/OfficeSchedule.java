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

package blood0cean.com.github.office.schedule.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OfficeSchedule service. Represents a row in the &quot;OFFICE_OfficeSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * @author Blood 0cean
 * @see OfficeScheduleModel
 * @generated
 */
@ImplementationClassName(
	"blood0cean.com.github.office.schedule.model.impl.OfficeScheduleImpl"
)
@ProviderType
public interface OfficeSchedule extends OfficeScheduleModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>blood0cean.com.github.office.schedule.model.impl.OfficeScheduleImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OfficeSchedule, Long>
		OFFICE_SCHEDULE_ID_ACCESSOR = new Accessor<OfficeSchedule, Long>() {

			@Override
			public Long get(OfficeSchedule officeSchedule) {
				return officeSchedule.getOfficeScheduleId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OfficeSchedule> getTypeClass() {
				return OfficeSchedule.class;
			}

		};

}