package com.Hotel;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.Hotel.model.Hotel;
import com.Hotel.service.HotelLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class hotelCRUD
 */
public class HotelCRUD extends MVCPortlet {

	private static Log log = LogFactoryUtil.getLog(Hotel.class);

	public static final String PARAM_PAGE = "page";
	public static final String CURRENT_HOTEL_ID = "current_hotel_id";

	public static final String PAGE_DETAIL = "detail";
	public static final String JSP_DETAIL = "/html/hotelcrud/detail.jsp";
	public static final String JSP_VIEW = "/html/hotelcrud/view.jsp";

	public static final String ERROR_GENERIC = "errorGeneric";
	public static final String ERROR_NO_PARAM = "errorNoParam";

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		String pageMode = request.getParameter(PARAM_PAGE);

		if (PAGE_DETAIL.equals(pageMode)) {
			String paramHotelId = request.getParameter(CURRENT_HOTEL_ID);
			if (null != paramHotelId) {
				if (paramHotelId == "-1") {
					Hotel hotel = null;
					request.setAttribute("hotel", hotel);

				} else {
					try {
						int hotel_id = Integer.parseInt(paramHotelId);
						Hotel hotel = HotelLocalServiceUtil.getHotel(hotel_id);
						request.setAttribute("hotel", hotel);
					} catch (NumberFormatException e) {
						log.error("Request param 'hotelid' (" + paramHotelId
								+ ")" + " has incorrect format. "
								+ e.getMessage());
						request.setAttribute("error", ERROR_GENERIC);
					} catch (PortalException e) {
						log.error("Failed to get the hotels. " + e.getMessage());
					} catch (SystemException e) {
						log.error("Failed to get the hotels. " + e.getMessage());
					}
				}
			} else {
				request.setAttribute("error", ERROR_NO_PARAM);
			}
			include(JSP_DETAIL, request, response);
		} else {
			try {
				List<Hotel> hotels = HotelLocalServiceUtil.getHotels(
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				request.setAttribute("hotels", hotels);
			} catch (SystemException e) {
				log.error("Failed to get all hotels. " + e.getMessage());
			}
			include(JSP_VIEW, request, response);
		}
	}

	public void delete(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {
		int paramHotelId = Integer.parseInt(actionRequest
				.getParameter(CURRENT_HOTEL_ID));
		HotelLocalServiceUtil.deleteHotel(paramHotelId);
		// include(JSP_VIEW, actionRequest, actionResponse);
	}

	public void update(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {
		int paramHotelId;
		try {
			paramHotelId = Integer.parseInt(actionRequest.getParameter(
					"hotelId").trim());
		} catch (NumberFormatException e) {
			paramHotelId = -1;
		}
		String paramHotelName = actionRequest.getParameter("name");
		String paramHotelPhone = actionRequest.getParameter("phone");
		String paramHotelAddress = actionRequest.getParameter("address");
		String paramHotelRooms = actionRequest.getParameter("rooms");
		HotelLocalServiceUtil.addOrUpdateHotel(paramHotelId, paramHotelName,
				paramHotelAddress, paramHotelPhone, paramHotelRooms);
	}
	
	public void updateHotel(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {
		int paramHotelId;
		
	}
}