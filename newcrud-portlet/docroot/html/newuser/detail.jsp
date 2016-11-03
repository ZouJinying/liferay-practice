<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ page import="com.test.newuser"%>

<c:if test="${empty users}">
	<c:choose>
		<c:when test="${error == 'errorGeneric'}">
			<div class="alert alert-error">Sorry, something went wrong.</div>	
		</c:when>
		<c:when test="${error == 'errorNoParam'}">
			<div class="alert alert-error">You did not include a necessary request parameter.</div>	
		</c:when>
	</c:choose>
</c:if>

<c:if test="${not empty users}">
	<div>User ID: ${user.userId}</div>
	<div>Name: ${user.name}</div>
	<div>Friendly URL: ${user.friendlyURL}</div>
</c:if>

<liferay-portlet:renderURL var="defaultViewURL" />
<aui:button-row>
	<aui:button href="${defaultViewURL}" value="Back" />
</aui:button-row>

