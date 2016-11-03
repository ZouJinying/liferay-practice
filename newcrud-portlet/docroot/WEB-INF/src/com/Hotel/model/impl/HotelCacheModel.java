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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Hotel in entity cache.
 *
 * @author jes
 * @see Hotel
 * @generated
 */
public class HotelCacheModel implements CacheModel<Hotel>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", hotelId=");
		sb.append(hotelId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", quantityRooms=");
		sb.append(quantityRooms);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Hotel toEntityModel() {
		HotelImpl hotelImpl = new HotelImpl();

		if (uuid == null) {
			hotelImpl.setUuid(StringPool.BLANK);
		}
		else {
			hotelImpl.setUuid(uuid);
		}

		hotelImpl.setHotelId(hotelId);

		if (name == null) {
			hotelImpl.setName(StringPool.BLANK);
		}
		else {
			hotelImpl.setName(name);
		}

		if (address == null) {
			hotelImpl.setAddress(StringPool.BLANK);
		}
		else {
			hotelImpl.setAddress(address);
		}

		if (phone == null) {
			hotelImpl.setPhone(StringPool.BLANK);
		}
		else {
			hotelImpl.setPhone(phone);
		}

		if (quantityRooms == null) {
			hotelImpl.setQuantityRooms(StringPool.BLANK);
		}
		else {
			hotelImpl.setQuantityRooms(quantityRooms);
		}

		hotelImpl.resetOriginalValues();

		return hotelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		hotelId = objectInput.readLong();
		name = objectInput.readUTF();
		address = objectInput.readUTF();
		phone = objectInput.readUTF();
		quantityRooms = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(hotelId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (quantityRooms == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quantityRooms);
		}
	}

	public String uuid;
	public long hotelId;
	public String name;
	public String address;
	public String phone;
	public String quantityRooms;
}