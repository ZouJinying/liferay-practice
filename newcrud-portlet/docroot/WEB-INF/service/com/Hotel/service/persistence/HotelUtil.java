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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the hotel service. This utility wraps {@link HotelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jes
 * @see HotelPersistence
 * @see HotelPersistenceImpl
 * @generated
 */
public class HotelUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Hotel hotel) {
		getPersistence().clearCache(hotel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Hotel> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Hotel> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Hotel> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Hotel update(Hotel hotel) throws SystemException {
		return getPersistence().update(hotel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Hotel update(Hotel hotel, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(hotel, serviceContext);
	}

	/**
	* Returns all the hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.Hotel.model.Hotel> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.Hotel.model.Hotel[] findByUuid_PrevAndNext(long hotelId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(hotelId, uuid, orderByComparator);
	}

	/**
	* Removes all the hotels where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the hotels where name = &#63;.
	*
	* @param name the name
	* @return the matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname(name);
	}

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
	public static java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname(name, start, end);
	}

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
	public static java.util.List<com.Hotel.model.Hotel> findByname(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	* Returns the first hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel findByname_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	* Returns the first hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel fetchByname_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	* Returns the last hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws com.Hotel.NoSuchHotelException if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel findByname_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	* Returns the last hotel in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel fetchByname_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

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
	public static com.Hotel.model.Hotel[] findByname_PrevAndNext(long hotelId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByname_PrevAndNext(hotelId, name, orderByComparator);
	}

	/**
	* Removes all the hotels where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByname(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByname(name);
	}

	/**
	* Returns the number of hotels where name = &#63;.
	*
	* @param name the name
	* @return the number of matching hotels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByname(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByname(name);
	}

	/**
	* Caches the hotel in the entity cache if it is enabled.
	*
	* @param hotel the hotel
	*/
	public static void cacheResult(com.Hotel.model.Hotel hotel) {
		getPersistence().cacheResult(hotel);
	}

	/**
	* Caches the hotels in the entity cache if it is enabled.
	*
	* @param hotels the hotels
	*/
	public static void cacheResult(java.util.List<com.Hotel.model.Hotel> hotels) {
		getPersistence().cacheResult(hotels);
	}

	/**
	* Creates a new hotel with the primary key. Does not add the hotel to the database.
	*
	* @param hotelId the primary key for the new hotel
	* @return the new hotel
	*/
	public static com.Hotel.model.Hotel create(long hotelId) {
		return getPersistence().create(hotelId);
	}

	/**
	* Removes the hotel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel that was removed
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel remove(long hotelId)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hotelId);
	}

	public static com.Hotel.model.Hotel updateImpl(com.Hotel.model.Hotel hotel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hotel);
	}

	/**
	* Returns the hotel with the primary key or throws a {@link com.Hotel.NoSuchHotelException} if it could not be found.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel
	* @throws com.Hotel.NoSuchHotelException if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel findByPrimaryKey(long hotelId)
		throws com.Hotel.NoSuchHotelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hotelId);
	}

	/**
	* Returns the hotel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hotelId the primary key of the hotel
	* @return the hotel, or <code>null</code> if a hotel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.Hotel.model.Hotel fetchByPrimaryKey(long hotelId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hotelId);
	}

	/**
	* Returns all the hotels.
	*
	* @return the hotels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.Hotel.model.Hotel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.Hotel.model.Hotel> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.Hotel.model.Hotel> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the hotels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hotels.
	*
	* @return the number of hotels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HotelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HotelPersistence)PortletBeanLocatorUtil.locate(com.Hotel.service.ClpSerializer.getServletContextName(),
					HotelPersistence.class.getName());

			ReferenceRegistry.registerReference(HotelUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HotelPersistence persistence) {
	}

	private static HotelPersistence _persistence;
}