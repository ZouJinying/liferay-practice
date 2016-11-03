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

import com.Hotel.service.ClpSerializer;
import com.Hotel.service.HotelLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jes
 */
public class HotelClp extends BaseModelImpl<Hotel> implements Hotel {
	public HotelClp() {
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
	public long getPrimaryKey() {
		return _hotelId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHotelId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hotelId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_hotelRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHotelId() {
		return _hotelId;
	}

	@Override
	public void setHotelId(long hotelId) {
		_hotelId = hotelId;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setHotelId", long.class);

				method.invoke(_hotelRemoteModel, hotelId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_hotelRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_hotelRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_hotelRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantityRooms() {
		return _quantityRooms;
	}

	@Override
	public void setQuantityRooms(String quantityRooms) {
		_quantityRooms = quantityRooms;

		if (_hotelRemoteModel != null) {
			try {
				Class<?> clazz = _hotelRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantityRooms", String.class);

				method.invoke(_hotelRemoteModel, quantityRooms);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHotelRemoteModel() {
		return _hotelRemoteModel;
	}

	public void setHotelRemoteModel(BaseModel<?> hotelRemoteModel) {
		_hotelRemoteModel = hotelRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _hotelRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_hotelRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HotelLocalServiceUtil.addHotel(this);
		}
		else {
			HotelLocalServiceUtil.updateHotel(this);
		}
	}

	@Override
	public Hotel toEscapedModel() {
		return (Hotel)ProxyUtil.newProxyInstance(Hotel.class.getClassLoader(),
			new Class[] { Hotel.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HotelClp clone = new HotelClp();

		clone.setUuid(getUuid());
		clone.setHotelId(getHotelId());
		clone.setName(getName());
		clone.setAddress(getAddress());
		clone.setPhone(getPhone());
		clone.setQuantityRooms(getQuantityRooms());

		return clone;
	}

	@Override
	public int compareTo(Hotel hotel) {
		long primaryKey = hotel.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HotelClp)) {
			return false;
		}

		HotelClp hotel = (HotelClp)obj;

		long primaryKey = hotel.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", hotelId=");
		sb.append(getHotelId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", quantityRooms=");
		sb.append(getQuantityRooms());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.Hotel.model.Hotel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hotelId</column-name><column-value><![CDATA[");
		sb.append(getHotelId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityRooms</column-name><column-value><![CDATA[");
		sb.append(getQuantityRooms());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _hotelId;
	private String _name;
	private String _address;
	private String _phone;
	private String _quantityRooms;
	private BaseModel<?> _hotelRemoteModel;
	private Class<?> _clpSerializerClass = com.Hotel.service.ClpSerializer.class;
}