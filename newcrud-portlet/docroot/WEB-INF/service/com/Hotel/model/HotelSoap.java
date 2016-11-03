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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.Hotel.service.http.HotelServiceSoap}.
 *
 * @author jes
 * @see com.Hotel.service.http.HotelServiceSoap
 * @generated
 */
public class HotelSoap implements Serializable {
	public static HotelSoap toSoapModel(Hotel model) {
		HotelSoap soapModel = new HotelSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setHotelId(model.getHotelId());
		soapModel.setName(model.getName());
		soapModel.setAddress(model.getAddress());
		soapModel.setPhone(model.getPhone());
		soapModel.setQuantityRooms(model.getQuantityRooms());

		return soapModel;
	}

	public static HotelSoap[] toSoapModels(Hotel[] models) {
		HotelSoap[] soapModels = new HotelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HotelSoap[][] toSoapModels(Hotel[][] models) {
		HotelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HotelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HotelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HotelSoap[] toSoapModels(List<Hotel> models) {
		List<HotelSoap> soapModels = new ArrayList<HotelSoap>(models.size());

		for (Hotel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HotelSoap[soapModels.size()]);
	}

	public HotelSoap() {
	}

	public long getPrimaryKey() {
		return _hotelId;
	}

	public void setPrimaryKey(long pk) {
		setHotelId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getHotelId() {
		return _hotelId;
	}

	public void setHotelId(long hotelId) {
		_hotelId = hotelId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getQuantityRooms() {
		return _quantityRooms;
	}

	public void setQuantityRooms(String quantityRooms) {
		_quantityRooms = quantityRooms;
	}

	private String _uuid;
	private long _hotelId;
	private String _name;
	private String _address;
	private String _phone;
	private String _quantityRooms;
}