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

package com.Hotel.model.impl;

import com.Hotel.model.Hotel;
import com.Hotel.model.HotelModel;
import com.Hotel.model.HotelSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Hotel service. Represents a row in the &quot;Hotel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.Hotel.model.HotelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HotelImpl}.
 * </p>
 *
 * @author jes
 * @see HotelImpl
 * @see com.Hotel.model.Hotel
 * @see com.Hotel.model.HotelModel
 * @generated
 */
@JSON(strict = true)
public class HotelModelImpl extends BaseModelImpl<Hotel> implements HotelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a hotel model instance should use the {@link com.Hotel.model.Hotel} interface instead.
	 */
	public static final String TABLE_NAME = "Hotel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "hotelId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "quantityRooms", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Hotel (uuid_ VARCHAR(75) null,hotelId LONG not null primary key,name VARCHAR(75) null,address VARCHAR(75) null,phone VARCHAR(75) null,quantityRooms VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Hotel";
	public static final String ORDER_BY_JPQL = " ORDER BY hotel.hotelId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Hotel.hotelId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.Hotel.model.Hotel"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.Hotel.model.Hotel"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.Hotel.model.Hotel"),
			true);
	public static long NAME_COLUMN_BITMASK = 1L;
	public static long UUID_COLUMN_BITMASK = 2L;
	public static long HOTELID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Hotel toModel(HotelSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Hotel model = new HotelImpl();

		model.setUuid(soapModel.getUuid());
		model.setHotelId(soapModel.getHotelId());
		model.setName(soapModel.getName());
		model.setAddress(soapModel.getAddress());
		model.setPhone(soapModel.getPhone());
		model.setQuantityRooms(soapModel.getQuantityRooms());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Hotel> toModels(HotelSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Hotel> models = new ArrayList<Hotel>(soapModels.length);

		for (HotelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.Hotel.model.Hotel"));

	public HotelModelImpl() {
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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getHotelId() {
		return _hotelId;
	}

	@Override
	public void setHotelId(long hotelId) {
		_hotelId = hotelId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	@Override
	public String getQuantityRooms() {
		if (_quantityRooms == null) {
			return StringPool.BLANK;
		}
		else {
			return _quantityRooms;
		}
	}

	@Override
	public void setQuantityRooms(String quantityRooms) {
		_quantityRooms = quantityRooms;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Hotel.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Hotel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Hotel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HotelImpl hotelImpl = new HotelImpl();

		hotelImpl.setUuid(getUuid());
		hotelImpl.setHotelId(getHotelId());
		hotelImpl.setName(getName());
		hotelImpl.setAddress(getAddress());
		hotelImpl.setPhone(getPhone());
		hotelImpl.setQuantityRooms(getQuantityRooms());

		hotelImpl.resetOriginalValues();

		return hotelImpl;
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

		if (!(obj instanceof Hotel)) {
			return false;
		}

		Hotel hotel = (Hotel)obj;

		long primaryKey = hotel.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		HotelModelImpl hotelModelImpl = this;

		hotelModelImpl._originalUuid = hotelModelImpl._uuid;

		hotelModelImpl._originalName = hotelModelImpl._name;

		hotelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Hotel> toCacheModel() {
		HotelCacheModel hotelCacheModel = new HotelCacheModel();

		hotelCacheModel.uuid = getUuid();

		String uuid = hotelCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			hotelCacheModel.uuid = null;
		}

		hotelCacheModel.hotelId = getHotelId();

		hotelCacheModel.name = getName();

		String name = hotelCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			hotelCacheModel.name = null;
		}

		hotelCacheModel.address = getAddress();

		String address = hotelCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			hotelCacheModel.address = null;
		}

		hotelCacheModel.phone = getPhone();

		String phone = hotelCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			hotelCacheModel.phone = null;
		}

		hotelCacheModel.quantityRooms = getQuantityRooms();

		String quantityRooms = hotelCacheModel.quantityRooms;

		if ((quantityRooms != null) && (quantityRooms.length() == 0)) {
			hotelCacheModel.quantityRooms = null;
		}

		return hotelCacheModel;
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

	private static ClassLoader _classLoader = Hotel.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Hotel.class };
	private String _uuid;
	private String _originalUuid;
	private long _hotelId;
	private String _name;
	private String _originalName;
	private String _address;
	private String _phone;
	private String _quantityRooms;
	private long _columnBitmask;
	private Hotel _escapedModel;
}