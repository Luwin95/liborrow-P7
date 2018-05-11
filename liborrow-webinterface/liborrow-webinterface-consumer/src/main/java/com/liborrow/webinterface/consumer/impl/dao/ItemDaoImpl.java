package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.ItemDao;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.ReservationResponse;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class ItemDaoImpl extends AbstractDao implements ItemDao{

	public ItemDTO getItem(Long itemId) {
		return getItemSrv().getItem(itemId);
	}
	
	public SearchResponse searchItem(ItemCriterias itemCriterias) {
		SearchResponse searchResponse = getItemSrv().searchItem(itemCriterias);
		return searchResponse;
	}
	
	public SearchResponse findLastFiveItems() {
		return getItemSrv().homeLastFiveItems();
	}
	
	public ReservationResponse reserveItem(ItemDTO item, UserLightDTO user) {
		return getItemSrv().reserveItem(item, user);
	}
	
	public ReservationResponse cancelItemReservation(Long itemId, UserLightDTO user) {
		return getItemSrv().cancelReservation(itemId, user);
	}
}
