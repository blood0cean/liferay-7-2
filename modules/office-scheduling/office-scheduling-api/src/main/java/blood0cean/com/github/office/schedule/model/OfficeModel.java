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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Office service. Represents a row in the &quot;OFFICE_Office&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>blood0cean.com.github.office.schedule.model.impl.OfficeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>blood0cean.com.github.office.schedule.model.impl.OfficeImpl</code>.
 * </p>
 *
 * @author Blood 0cean
 * @see Office
 * @generated
 */
@ProviderType
public interface OfficeModel
	extends BaseModel<Office>, GroupedModel, LocalizedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a office model instance should use the {@link Office} interface instead.
	 */

	/**
	 * Returns the primary key of this office.
	 *
	 * @return the primary key of this office
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this office.
	 *
	 * @param primaryKey the primary key of this office
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this office.
	 *
	 * @return the uuid of this office
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this office.
	 *
	 * @param uuid the uuid of this office
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the office ID of this office.
	 *
	 * @return the office ID of this office
	 */
	public long getOfficeId();

	/**
	 * Sets the office ID of this office.
	 *
	 * @param officeId the office ID of this office
	 */
	public void setOfficeId(long officeId);

	/**
	 * Returns the group ID of this office.
	 *
	 * @return the group ID of this office
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this office.
	 *
	 * @param groupId the group ID of this office
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this office.
	 *
	 * @return the company ID of this office
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this office.
	 *
	 * @param companyId the company ID of this office
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this office.
	 *
	 * @return the user ID of this office
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this office.
	 *
	 * @param userId the user ID of this office
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this office.
	 *
	 * @return the user uuid of this office
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this office.
	 *
	 * @param userUuid the user uuid of this office
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this office.
	 *
	 * @return the user name of this office
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this office.
	 *
	 * @param userName the user name of this office
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this office.
	 *
	 * @return the create date of this office
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this office.
	 *
	 * @param createDate the create date of this office
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this office.
	 *
	 * @return the modified date of this office
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this office.
	 *
	 * @param modifiedDate the modified date of this office
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this office.
	 *
	 * @return the name of this office
	 */
	public String getName();

	/**
	 * Returns the localized name of this office in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this office
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this office in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this office. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this office in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this office
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this office in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this office
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this office.
	 *
	 * @return the locales and localized names of this office
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this office.
	 *
	 * @param name the name of this office
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this office in the language.
	 *
	 * @param name the localized name of this office
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this office in the language, and sets the default locale.
	 *
	 * @param name the localized name of this office
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this office from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this office
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this office from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this office
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the description of this office.
	 *
	 * @return the description of this office
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this office in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this office
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this office in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this office. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this office in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this office
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this office in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this office
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this office.
	 *
	 * @return the locales and localized descriptions of this office
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this office.
	 *
	 * @param description the description of this office
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this office in the language.
	 *
	 * @param description the localized description of this office
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this office in the language, and sets the default locale.
	 *
	 * @param description the localized description of this office
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(
		String description, Locale locale, Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this office from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this office
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this office from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this office
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(
		Map<Locale, String> descriptionMap, Locale defaultLocale);

	/**
	 * Returns the active of this office.
	 *
	 * @return the active of this office
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this office is active.
	 *
	 * @return <code>true</code> if this office is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this office is active.
	 *
	 * @param active the active of this office
	 */
	public void setActive(boolean active);

	/**
	 * Returns the max people allowed of this office.
	 *
	 * @return the max people allowed of this office
	 */
	public int getMaxPeopleAllowed();

	/**
	 * Sets the max people allowed of this office.
	 *
	 * @param maxPeopleAllowed the max people allowed of this office
	 */
	public void setMaxPeopleAllowed(int maxPeopleAllowed);

	/**
	 * Returns the week open days of this office.
	 *
	 * @return the week open days of this office
	 */
	@AutoEscape
	public String getWeekOpenDays();

	/**
	 * Sets the week open days of this office.
	 *
	 * @param weekOpenDays the week open days of this office
	 */
	public void setWeekOpenDays(String weekOpenDays);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

}