<%@page import="blood0cean.com.github.office.schedule.service.OfficeLocalServiceUtil"%>
<%@ include file="./init.jsp" %>

<aui:button-row>
	<portlet:renderURL var="addOfficeURL">
	    <portlet:param name="mvcPath" value="/office/edit_office.jsp"></portlet:param>
	</portlet:renderURL>

    <aui:button value="Add Office" onClick="<%= addOfficeURL.toString() %>"></aui:button>
</aui:button-row>

<liferay-ui:search-container total="<%= OfficeLocalServiceUtil.getOfficesCount() %>">
	<liferay-ui:search-container-results results="<%= OfficeLocalServiceUtil.getOffices(scopeGroupId.longValue(), searchContainer.getStart(), searchContainer.getEnd()) %>" />
	<liferay-ui:search-container-row className="blood0cean.com.github.office.schedule.model.Office" modelVar="office">
		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="description" />
		<liferay-ui:search-container-column-text property="active" />
		<liferay-ui:search-container-column-text property="maxPeopleAllowed" />
		<liferay-ui:search-container-column-text property="weekOpenDays" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>