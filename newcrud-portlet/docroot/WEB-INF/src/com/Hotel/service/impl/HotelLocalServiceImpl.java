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

package com.Hotel.service.impl;

import java.util.Date;
import java.util.List;

import com.Hotel.NoSuchHotelException;
import com.Hotel.model.Hotel;
import com.Hotel.service.HotelLocalServiceUtil;
import com.Hotel.service.base.HotelLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetLinkConstants;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;


/**
 * The implementation of the hotel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.Hotel.service.HotelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author jes
 * @see com.Hotel.service.base.HotelLocalServiceBaseImpl
 * @see com.Hotel.service.HotelLocalServiceUtil
 */
public class HotelLocalServiceImpl extends HotelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.Hotel.service.HotelLocalServiceUtil} to access the hotel local
	 * service.
	 */
	// methods here
	public List<Hotel> findByName(String name) throws SystemException {

		return hotelPersistence.findByname(name);

	}

	public Hotel addOrUpdateHotel(int hotelId, String name, String address,
			String phone, String quantityOfRooms) throws PortalException,
			SystemException {
		Hotel hotel = null;
		if (hotelId != -1) {
			hotel = HotelLocalServiceUtil.getHotel(hotelId);
		} else {
			hotel = hotelLocalService.createHotel((int) CounterLocalServiceUtil
					.increment(Hotel.class.getName()));
		}
		
		try {
			hotel.setName(name);
			hotel.setAddress(address);
			hotel.setPhone(phone);
			hotel.setQuantityRooms(quantityOfRooms);
			hotel = HotelLocalServiceUtil.updateHotel(hotel);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return hotel;
	}

	public Hotel addHotel(long userId, String name,
			ServiceContext serviceContext) throws SystemException,
			PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long hotelId = counterLocalService.increment();

		Hotel hotel = hotelPersistence.create(hotelId);

		// hotel.setUuid(serviceContext.getUuid());
		// hotel.setUserId(userId);
		// hotel.setGroupId(groupId);
		// hotel.setCompanyId(user.getCompanyId());
		// hotel.setUserName(user.getFullName());
		// hotel.setCreateDate(serviceContext.getCreateDate(now));
		// hotel.setModifiedDate(serviceContext.getModifiedDate(now));
		hotel.setName(name);
		hotel.setExpandoBridgeAttributes(serviceContext);

		hotelPersistence.update(hotel);

		resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
				Hotel.class.getName(), hotelId, false, true, true);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
				groupId, now, now,
				Hotel.class.getName(), hotelId, "", 0,
				serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), true, null, null, null,
				ContentTypes.TEXT_HTML, hotel.getName(), null, null, null,
				null, 0, 0, null, false);

		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
				serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Hotel.class);

		indexer.reindex(hotel);

		return hotel;
	}

	@Override
	public Hotel updateHotel(long userId, int hotelId, String name,
			ServiceContext serviceContext) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Hotel updateHotel(long userId, long hotelId,
            String name, ServiceContext serviceContext) throws PortalException,
            SystemException {

    Date now = new Date();

    Hotel hotel = getHotel(hotelId);

    User user = UserLocalServiceUtil.getUser(userId);
    long groupId = serviceContext.getScopeGroupId();
  //  hotel.setUserId(userId);
  //  hotel.setUserName(user.getFullName());
  //  hotel.setModifiedDate(serviceContext.getModifiedDate(now));
    hotel.setName(name);
    hotel.setExpandoBridgeAttributes(serviceContext);

    hotelPersistence.update(hotel);

    resourceLocalService.updateResources(serviceContext.getCompanyId(),
                    serviceContext.getScopeGroupId(), name, hotelId,
                    serviceContext.getGroupPermissions(),
                    serviceContext.getGuestPermissions());

    AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
                    groupId, now,
                    now, Hotel.class.getName(),
                    hotelId,"", 0,
                    serviceContext.getAssetCategoryIds(),
                    serviceContext.getAssetTagNames(), true, null, null, null,
                    ContentTypes.TEXT_HTML, hotel.getName(), null, null, null,
                    null, 0, 0, null, false);

    assetLinkLocalService.updateLinks(serviceContext.getUserId(),
                    assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
                    AssetLinkConstants.TYPE_RELATED);

    Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                    Hotel.class);

    indexer.reindex(hotel);

    return hotel;
}
	
	public Hotel deleteHotel(long hotelId,
            ServiceContext serviceContext) throws PortalException,
            SystemException {

		Hotel hotel = getHotel(hotelId);

 /*   List<Entry> entries = EntryLocalServiceUtil.getEntries(
                    serviceContext.getScopeGroupId(), hotelId);

    for (Entry entry : entries) {
            EntryLocalServiceUtil.deleteEntry(entry.getEntryId(),
                            serviceContext);
    }
*/
    resourceLocalService.deleteResource(serviceContext.getCompanyId(),
                    Hotel.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
                    hotelId);

    AssetEntry assetEntry = assetEntryLocalService.fetchEntry(
                    Hotel.class.getName(), hotelId);

    assetLinkLocalService.deleteLinks(assetEntry.getEntryId());

    assetEntryLocalService.deleteEntry(assetEntry);

    Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                    Hotel.class);

    indexer.delete(hotel);

    hotel = deleteHotel(hotelId);

    return hotel;
}

}