<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ page import="com.Hotel.HotelCRUD"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<head>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

</head>
<portlet:defineObjects />
<script>
	$(document).ready(function() {
		$('#hotels').dataTable();
	});
</script>
<table id="hotels" class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th><liferay-ui:message key="hotelId"></liferay-ui:message></th>
			<th><liferay-ui:message key="hotelName"></liferay-ui:message></th>
			<th><liferay-ui:message key="operation"></liferay-ui:message></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="hotel" items="${hotels}">
			<portlet:actionURL name="delete" var="delete">
				<portlet:param name="<%=HotelCRUD.CURRENT_HOTEL_ID%>"
					value="${hotel.hotelId}"></portlet:param>
			</portlet:actionURL>
			<liferay-portlet:renderURL var="hotelDetailURL">
				<liferay-portlet:param name="<%=HotelCRUD.PARAM_PAGE%>"
					value="<%=HotelCRUD.PAGE_DETAIL%>" />
				<liferay-portlet:param name="<%=HotelCRUD.CURRENT_HOTEL_ID%>"
					value="${hotel.hotelId}" />
			</liferay-portlet:renderURL>

			<tr>
				<td><a href="${hotelDetailURL}">${hotel.hotelId}</a></td>
				<td>${hotel.name}</td>
				<td><liferay-ui:icon-delete url="${delete}"
						confirmation="Are you sure to delete this?" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<aui:button-row>
	<liferay-portlet:renderURL var="hotelDetailURL">
		<liferay-portlet:param name="<%=HotelCRUD.PARAM_PAGE%>"
			value="<%=HotelCRUD.PAGE_DETAIL%>" />
		<liferay-portlet:param name="<%=HotelCRUD.CURRENT_HOTEL_ID%>"
			value="-1" />
	</liferay-portlet:renderURL>
	<aui:button href="${hotelDetailURL}" value="insert"  />
</aui:button-row>

