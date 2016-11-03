/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.Hotel.service.impl;


import java.util.Date;
import java.util.List;

import com.Hotel.service.base.HotelServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.Session;


/**
 * The implementation of the hotel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.Hotel.service.HotelService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author jes
 * @see com.Hotel.service.base.HotelServiceBaseImpl
 * @see com.Hotel.service.HotelServiceUtil
 */
public class HotelServiceImpl extends HotelServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.Hotel.service.HotelServiceUtil} to access the hotel remote service.
	 */
	public int ListAll(){
		
		return 0;
		
	}
	
	public int CountAll()
	{
		
		return 0;
	}
	public void addhotel()
	{}
	public void editHotel()
	{}
	public void deleteHotel()
	{}
}
