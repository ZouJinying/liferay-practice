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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Hotel service. Represents a row in the &quot;Hotel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.Hotel.model.impl.HotelModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.Hotel.model.impl.HotelImpl}.
 * </p>
 *
 * @author jes
 * @see Hotel
 * @see com.Hotel.model.impl.HotelImpl
 * @see com.Hotel.model.impl.HotelModelImpl
 * @generated
 */
public interface HotelModel extends BaseModel<Hotel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a hotel model instance should use the {@link Hotel} interface instead.
	 */

	/**
	 * Returns the primary key of this hotel.
	 *
	 * @return the primary key of this hotel
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this hotel.
	 *
	 * @param primaryKey the primary key of this hotel
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this hotel.
	 *
	 * @return the uuid of this hotel
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this hotel.
	 *
	 * @param uuid the uuid of this hotel
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the hotel ID of this hotel.
	 *
	 * @return the hotel ID of this hotel
	 */
	public long getHotelId();

	/**
	 * Sets the hotel ID of this hotel.
	 *
	 * @param hotelId the hotel ID of this hotel
	 */
	public void setHotelId(long hotelId);

	/**
	 * Returns the name of this hotel.
	 *
	 * @return the name of this hotel
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this hotel.
	 *
	 * @param name the name of this hotel
	 */
	public void setName(String name);

	/**
	 * Returns the address of this hotel.
	 *
	 * @return the address of this hotel
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this hotel.
	 *
	 * @param address the address of this hotel
	 */
	public void setAddress(String address);

	/**
	 * Returns the phone of this hotel.
	 *
	 * @return the phone of this hotel
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this hotel.
	 *
	 * @param phone the phone of this hotel
	 */
	public void setPhone(String phone);

	/**
	 * Returns the quantity rooms of this hotel.
	 *
	 * @return the quantity rooms of this hotel
	 */
	@AutoEscape
	public String getQuantityRooms();

	/**
	 * Sets the quantity rooms of this hotel.
	 *
	 * @param quantityRooms the quantity rooms of this hotel
	 */
	public void setQuantityRooms(String quantityRooms);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.Hotel.model.Hotel hotel);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.Hotel.model.Hotel> toCacheModel();

	@Override
	public com.Hotel.model.Hotel toEscapedModel();

	@Override
	public com.Hotel.model.Hotel toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}