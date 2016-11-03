<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ page import="com.test.newuser"%>

<portlet:defineObjects />
User List:
<c:choose>
	<c:when test="${empty users}">
		<div class="alert alert-info">Sorry, but no groups were found.</div>	
	</c:when>
	<c:otherwise>
		<ul>
			<c:forEach var="user" items="${users}">
				<li>
					<liferay-portlet:renderURL var="userDetailURL">
						<liferay-portlet:param name="<%=newuser.PARAM_PAGE%>" 
							value="<%=newuser.PAGE_DETAIL%>"/>
					<liferay-portlet:param name="<%=newuser.PARAM_USER_ID%>" 
							value="${user.userId}"/>
					</liferay-portlet:renderURL>
						<a href="${userDetailURL}">${user.userId}</a>
						 ${user.screenName}   
						 ${user.emailAddress}   
				</li>
			</c:forEach>
		</ul>
	</c:otherwise>
</c:choose>





