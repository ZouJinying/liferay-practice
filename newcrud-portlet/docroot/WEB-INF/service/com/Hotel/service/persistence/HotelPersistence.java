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

package com.Hotel.service.persistence;

import com.Hotel.model.Hotel;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the hotel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jes
 * @see HotelPersistenceImpl
 * @see HotelUtil
 * @generated
 */
public interface HotelPersistence extends BasePersistence<Hotel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HotelUtil} to access the hotel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the hotels where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the hotels where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hotels before and after the current hotel in the ordered set where uuid = &#63;.
	*
	* @param hotelId the primary key of the current hotel
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel[] findByUuid_PrevAndNext(long hotelId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the hotels where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the hotels where name = &#63;.
	*
	* @param name the name
	* @return the matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the hotels where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the hotels where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel findByname_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel fetchByname_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel findByname_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel fetchByname_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hotels before and after the current hotel in the ordered set where name = &#63;.
	*
	* @param hotelId the primary key of the current hotel
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel[] findByname_PrevAndNext(long hotelId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the hotels where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByname(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of hotels where name = &#63;.
	*
	* @param name the name
	* @return the number of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public int countByname(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the hotel in the entity cache if it is enabled.
	*
	* @param hotel the hotel
	*/
	public void cacheResult(com.Hotel.model.Hotel hotel);

	/**
	* Caches the hotels in the entity cache if it is enabled.
	*
	* @param hotels the hotels
	*/
	public void cacheResult(java.util.List<com.Hotel.model.Hotel> hotels);

	/**
	* Creates a new hotel with the primary key. Does not add the hotel to the database.
	*
	* @param hotelId the primary key for the new hotel
	* @return the new hotel
	*/
	public com.Hotel.model.Hotel create(long hotelId);

	/**
	* Removes the hotel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel that was removed
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel remove(long hotelId)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.Hotel.model.Hotel updateImpl(com.Hotel.model.Hotel hotel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hotel with the primary key or throws a {@link com.Hotel.NoSuchHotelException} if it could not be found.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel findByPrimaryKey(long hotelId)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hotel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel, or <code>null</code> if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.Hotel.model.Hotel fetchByPrimaryKey(long hotelId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the hotels.
	*
	* @return the hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.Hotel.model.Hotel> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Hotel.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hotels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.Hotel.model.Hotel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the hotels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of hotels.
	*
	* @return the number of hotels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}