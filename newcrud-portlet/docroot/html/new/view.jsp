<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@ page import="java.util.LinkedHashMap"%>
<%@ page import="com.liferay.portal.model.User"%>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<portlet:defineObjects />
user list:
<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= UserLocalServiceUtil.getUsers(0, 100) %>"
		total="<%= UserLocalServiceUtil.getUsersCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.portal.model.User"
		modelVar="aUser"
	>
	
		<liferay-ui:search-container-column-text property="userId" />

		<liferay-ui:search-container-column-text property="emailAddress" />

		<liferay-ui:search-container-column-text property="screenName" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
