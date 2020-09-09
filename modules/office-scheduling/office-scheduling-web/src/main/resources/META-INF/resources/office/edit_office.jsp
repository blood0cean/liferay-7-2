<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="blood0cean.com.github.office.schedule.service.OfficeLocalServiceUtil"%>
<%@page import="blood0cean.com.github.office.schedule.model.Office"%>
<%@ include file="../init.jsp" %>

<% 

long officeId = ParamUtil.getLong(renderRequest, "officeId");

Office office = null;
if (officeId > 0) {
	office = OfficeLocalServiceUtil.getOffice(officeId);
}

%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addOffice" var="addOfficeURL" />

<aui:form action="<%= addOfficeURL %>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%= office %>" model="<%= Office.class %>" />

	<aui:fieldset>

		<aui:input name="name" localized="true"/>
		<aui:input name="description" localized="true"/>
		<aui:input name="active" type="checkbox" />
		<aui:input name="maxPeopleAllowed" type="number" />
		<aui:input name="officeId" type="hidden" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>