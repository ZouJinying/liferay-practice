<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ page import="com.Hotel.HotelCRUD"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<c:if test="${empty hotel}">
	<c:choose>
		<c:when test="${error == 'errorGeneric'}">
			<div class="alert alert-error">Sorry, something went wrong.</div>	
		</c:when>
		<c:when test="${error == 'errorNoParam'}">
			<div class="alert alert-error">You did not include a necessary request parameter.</div>	
		</c:when>
	</c:choose>
</c:if>


<liferay-portlet:actionURL name="update" var="update"/>
<form action="${update}" method="post">
  <p><liferay-ui:message key="hotelId"/>: <input type="text" name="<portlet:namespace />hotelId" readonly="readonly" value=" ${hotel.hotelId}"/></p>
  <p><liferay-ui:message key="hotelName"/>: <input type="text" name="<portlet:namespace />name" value="${hotel.name}"/></p>
  <p><liferay-ui:message key="phone"/>: <input type="text" name="<portlet:namespace />phone" value="${hotel.phone}" /></p>
  <p><liferay-ui:message key="address"/>: <input type="text" name="<portlet:namespace />address" value="${hotel.address}" /></p>
  <p> <liferay-ui:message key="rooms"/>: <input type="text" name="<portlet:namespace />rooms" value="${hotel.quantityRooms}" /></p>
  <input type="submit" value="update" />
</form>


<liferay-portlet:renderURL var="defaultViewURL" />
<aui:button-row>
	<aui:button href="${defaultViewURL}" value="Back" />
</aui:button-row>




<portlet:renderURL var="viewURL">
        <portlet:param name="mvcPath" value="/html/guestbookadmin/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name='<%="${hotel}"== null ? "addHotel" : "updateHotel" %>' var="defaultViewURL" />

<aui:form action="<%= defaultViewURL %>" name="<portlet:namespace />fm">
                <aui:model-context bean="${hotel}" model="<%= com.Hotel.model.Hotel.class %>" />

        <aui:fieldset>
                        <aui:input type="hidden" name="guestbookId"
                                value='<%= "${hotel}" == null ? "" : "${hotel.hotelId}" %>' />
                        <aui:input name="name" />
        </aui:fieldset>

                <liferay-ui:asset-categories-error />
                <liferay-ui:asset-tags-error />
                <liferay-ui:panel defaultState="closed" extended="<%= false %>" id="hotelCategorizationPanel" persistState="<%= true %>" title="categorization">
                        <aui:fieldset>
                                <aui:input name="categories" type="assetCategories" />

                                <aui:input name="tags" type="assetTags" />
                        </aui:fieldset>
                </liferay-ui:panel>
              

        <aui:button-row>
                        <aui:button type="submit"></aui:button>
                        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>

<aui:input name="categories" type="assetCategories" />
<aui:input name="tags" type="assetTags" />
