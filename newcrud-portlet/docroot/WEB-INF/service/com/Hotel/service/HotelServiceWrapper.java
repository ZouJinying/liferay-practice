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

package com.Hotel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HotelService}.
 *
 * @author jes
 * @see HotelService
 * @generated
 */
public class HotelServiceWrapper implements HotelService,
	ServiceWrapper<HotelService> {
	public HotelServiceWrapper(HotelService hotelService) {
		_hotelService = hotelService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _hotelService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hotelService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _hotelService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public int ListAll() {
		return _hotelService.ListAll();
	}

	@Override
	public int CountAll() {
		return _hotelService.CountAll();
	}

	@Override
	public void addhotel() {
		_hotelService.addhotel();
	}

	@Override
	public void editHotel() {
		_hotelService.editHotel();
	}

	@Override
	public void deleteHotel() {
		_hotelService.deleteHotel();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HotelService getWrappedHotelService() {
		return _hotelService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHotelService(HotelService hotelService) {
		_hotelService = hotelService;
	}

	@Override
	public HotelService getWrappedService() {
		return _hotelService;
	}

	@Override
	public void setWrappedService(HotelService hotelService) {
		_hotelService = hotelService;
	}

	private HotelService _hotelService;
}