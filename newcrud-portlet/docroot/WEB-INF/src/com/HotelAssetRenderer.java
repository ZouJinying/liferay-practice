package com;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.Hotel.model.Hotel;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

public class HotelAssetRenderer extends BaseAssetRenderer {

        private Hotel _hotel;

        public HotelAssetRenderer (Hotel hotel) {

        	_hotel = hotel;
        }

        @Override
        public boolean hasEditPermission(PermissionChecker permissionChecker) {

                long guestbookId = _hotel.getHotelId();

                boolean contains = true;
//
   
                return contains;
        }

        @Override
        public boolean hasViewPermission(PermissionChecker permissionChecker) {

              
                boolean contains = true;

         
                return contains;
        }

        @Override
        public String getClassName() {
                return Hotel.class.getName();
        }

        @Override
        public long getClassPK() {
                return _hotel.getHotelId();
        }

    
        @Override
        public String getSummary(Locale locale) {
                return "Name: " + _hotel.getName();
        }

        @Override
        public String getTitle(Locale locale) {
                return _hotel.getName();
        }

  



        @Override
        public String render(RenderRequest renderRequest,
                        RenderResponse renderResponse, String template) throws Exception {

                if (template.equals(TEMPLATE_FULL_CONTENT)) {
                        renderRequest.setAttribute("gb_hotel", _hotel);

                        return "/html/hotel/" + template + ".jsp";
                }
                else {
                        return null;
                }
        }

        private Log _log;

		@Override
		public long getGroupId() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long getUserId() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getUserName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUuid() {
			// TODO Auto-generated method stub
			return null;
		}

}