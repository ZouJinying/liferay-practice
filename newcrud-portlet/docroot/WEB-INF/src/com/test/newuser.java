package com.test;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class newuser
 */
public class newuser extends MVCPortlet {
	public static final String PARAM_PAGE = "page";
	public static final String PARAM_USER_ID = "userId";
	
	public static final String PAGE_DETAIL = "detail";
	public static final String JSP_DETAIL = "/html/newuser/detail.jsp";
	public static final String JSP_VIEW = "/html/newuser/view.jsp";
	
	public static final String ERROR_GENERIC = "errorGeneric";
	public static final String ERROR_NO_PARAM = "errorNoParam";
	
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {	
		try {
			List<User> users = UserLocalServiceUtil.getUsers(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			request.setAttribute("users", users);
			include(JSP_VIEW, request, response);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
