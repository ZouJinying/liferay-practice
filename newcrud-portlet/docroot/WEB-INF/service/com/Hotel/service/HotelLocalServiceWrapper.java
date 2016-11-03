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
 * Provides a wrapper for {@link HotelLocalService}.
 *
 * @author jes
 * @see HotelLocalService
 * @generated
 */
public class HotelLocalServiceWrapper implements HotelLocalService,
	ServiceWrapper<HotelLocalService> {
	public HotelLocalServiceWrapper(HotelLocalService hotelLocalService) {
		_hotelLocalService = hotelLocalService;
	}

	/**
	* Adds the hotel to the database. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.Hotel.model.Hotel addHotel(com.Hotel.model.Hotel hotel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.addHotel(hotel);
	}

	/**
	* Creates a new hotel with the primary key. Does not add the hotel to the database.
	*
	* @param hotelId the primary key for the new hotel
	* @return the new hotel
	*/
	@Override
	public com.Hotel.model.Hotel createHotel(long hotelId) {
		return _hotelLocalService.createHotel(hotelId);
	}

	/**
	* Deletes the hotel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel that was removed
	* @throws PortalException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.Hotel.model.Hotel deleteHotel(long hotelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.deleteHotel(hotelId);
	}

	/**
	* Deletes the hotel from the database. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.Hotel.model.Hotel deleteHotel(com.Hotel.model.Hotel hotel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.deleteHotel(hotel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hotelLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.Hotel.model.Hotel fetchHotel(long hotelId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.fetchHotel(hotelId);
	}

	/**
	* Returns the hotel with the primary key.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel
	* @throws PortalException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.Hotel.model.Hotel getHotel(long hotelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.getHotel(hotelId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of hotels
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.Hotel.model.Hotel> getHotels(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.getHotels(start, end);
	}

	/**
	* Returns the number of hotels.
	*
	* @return the number of hotels
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHotelsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.getHotelsCount();
	}

	/**
	* Updates the hotel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.Hotel.model.Hotel updateHotel(com.Hotel.model.Hotel hotel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.updateHotel(hotel);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _hotelLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hotelLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _hotelLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.Hotel.model.Hotel> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.findByName(name);
	}

	@Override
	public com.Hotel.model.Hotel addOrUpdateHotel(int hotelId,
		java.lang.String name, java.lang.String address,
		java.lang.String phone, java.lang.String quantityOfRooms)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.addOrUpdateHotel(hotelId, name, address,
			phone, quantityOfRooms);
	}

	@Override
	public com.Hotel.model.Hotel addHotel(long userId, java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.addHotel(userId, name, serviceContext);
	}

	@Override
	public com.Hotel.model.Hotel updateHotel(long userId, int hotelId,
		java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.updateHotel(userId, hotelId, name,
			serviceContext);
	}

	@Override
	public com.Hotel.model.Hotel updateHotel(long userId, long hotelId,
		java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.updateHotel(userId, hotelId, name,
			serviceContext);
	}

	@Override
	public com.Hotel.model.Hotel deleteHotel(long hotelId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hotelLocalService.deleteHotel(hotelId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HotelLocalService getWrappedHotelLocalService() {
		return _hotelLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHotelLocalService(HotelLocalService hotelLocalService) {
		_hotelLocalService = hotelLocalService;
	}

	@Override
	public HotelLocalService getWrappedService() {
		return _hotelLocalService;
	}

	@Override
	public void setWrappedService(HotelLocalService hotelLocalService) {
		_hotelLocalService = hotelLocalService;
	}

	private HotelLocalService _hotelLocalService;
}