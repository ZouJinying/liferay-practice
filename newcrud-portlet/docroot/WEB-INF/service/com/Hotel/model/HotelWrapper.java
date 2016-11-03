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

package com.Hotel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hotel}.
 * </p>
 *
 * @author jes
 * @see Hotel
 * @generated
 */
public class HotelWrapper implements Hotel, ModelWrapper<Hotel> {
	public HotelWrapper(Hotel hotel) {
		_hotel = hotel;
	}

	@Override
	public Class<?> getModelClass() {
		return Hotel.class;
	}

	@Override
	public String getModelClassName() {
		return Hotel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("hotelId", getHotelId());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("quantityRooms", getQuantityRooms());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long hotelId = (Long)attributes.get("hotelId");

		if (hotelId != null) {
			setHotelId(hotelId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String quantityRooms = (String)attributes.get("quantityRooms");

		if (quantityRooms != null) {
			setQuantityRooms(quantityRooms);
		}
	}

	/**
	* Returns the primary key of this hotel.
	*
	* @return the primary key of this hotel
	*/
	@Override
	public long getPrimaryKey() {
		return _hotel.getPrimaryKey();
	}

	/**
	* Sets the primary key of this hotel.
	*
	* @param primaryKey the primary key of this hotel
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hotel.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this hotel.
	*
	* @return the uuid of this hotel
	*/
	@Override
	public java.lang.String getUuid() {
		return _hotel.getUuid();
	}

	/**
	* Sets the uuid of this hotel.
	*
	* @param uuid the uuid of this hotel
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_hotel.setUuid(uuid);
	}

	/**
	* Returns the hotel ID of this hotel.
	*
	* @return the hotel ID of this hotel
	*/
	@Override
	public long getHotelId() {
		return _hotel.getHotelId();
	}

	/**
	* Sets the hotel ID of this hotel.
	*
	* @param hotelId the hotel ID of this hotel
	*/
	@Override
	public void setHotelId(long hotelId) {
		_hotel.setHotelId(hotelId);
	}

	/**
	* Returns the name of this hotel.
	*
	* @return the name of this hotel
	*/
	@Override
	public java.lang.String getName() {
		return _hotel.getName();
	}

	/**
	* Sets the name of this hotel.
	*
	* @param name the name of this hotel
	*/
	@Override
	public void setName(java.lang.String name) {
		_hotel.setName(name);
	}

	/**
	* Returns the address of this hotel.
	*
	* @return the address of this hotel
	*/
	@Override
	public java.lang.String getAddress() {
		return _hotel.getAddress();
	}

	/**
	* Sets the address of this hotel.
	*
	* @param address the address of this hotel
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_hotel.setAddress(address);
	}

	/**
	* Returns the phone of this hotel.
	*
	* @return the phone of this hotel
	*/
	@Override
	public java.lang.String getPhone() {
		return _hotel.getPhone();
	}

	/**
	* Sets the phone of this hotel.
	*
	* @param phone the phone of this hotel
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_hotel.setPhone(phone);
	}

	/**
	* Returns the quantity rooms of this hotel.
	*
	* @return the quantity rooms of this hotel
	*/
	@Override
	public java.lang.String getQuantityRooms() {
		return _hotel.getQuantityRooms();
	}

	/**
	* Sets the quantity rooms of this hotel.
	*
	* @param quantityRooms the quantity rooms of this hotel
	*/
	@Override
	public void setQuantityRooms(java.lang.String quantityRooms) {
		_hotel.setQuantityRooms(quantityRooms);
	}

	@Override
	public boolean isNew() {
		return _hotel.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_hotel.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _hotel.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hotel.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _hotel.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _hotel.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_hotel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hotel.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_hotel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_hotel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hotel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HotelWrapper((Hotel)_hotel.clone());
	}

	@Override
	public int compareTo(com.Hotel.model.Hotel hotel) {
		return _hotel.compareTo(hotel);
	}

	@Override
	public int hashCode() {
		return _hotel.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.Hotel.model.Hotel> toCacheModel() {
		return _hotel.toCacheModel();
	}

	@Override
	public com.Hotel.model.Hotel toEscapedModel() {
		return new HotelWrapper(_hotel.toEscapedModel());
	}

	@Override
	public com.Hotel.model.Hotel toUnescapedModel() {
		return new HotelWrapper(_hotel.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _hotel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hotel.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_hotel.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HotelWrapper)) {
			return false;
		}

		HotelWrapper hotelWrapper = (HotelWrapper)obj;

		if (Validator.equals(_hotel, hotelWrapper._hotel)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Hotel getWrappedHotel() {
		return _hotel;
	}

	@Override
	public Hotel getWrappedModel() {
		return _hotel;
	}

	@Override
	public void resetOriginalValues() {
		_hotel.resetOriginalValues();
	}

	private Hotel _hotel;
}