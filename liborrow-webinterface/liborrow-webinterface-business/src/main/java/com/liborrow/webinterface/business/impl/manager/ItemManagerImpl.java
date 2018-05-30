package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.ItemManager;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.ReservationResponse;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	public ItemDTO getItem(Long itemId) {
		return getDaoFactory().getItemDao().getItem(itemId);
	}
	
	public SearchResponse searchItem(ItemCriterias itemCriterias) {
		return getDaoFactory().getItemDao().searchItem(itemCriterias);
	}
	
	public SearchResponse findLastFiveItems() {
		return getDaoFactory().getItemDao().findLastFiveItems();
	}
	
	public SearchResponse searchAuthor(ItemCriterias itemCriterias) {
		return getDaoFactory().getAuthorDao().searchAuthor(itemCriterias);
	}
	
	public SearchResponse searchBook(ItemCriterias itemCriterias) {
		return getDaoFactory().getBookDao().searchBook(itemCriterias);
	}
	
	public SearchResponse searchMagazine(ItemCriterias itemCriterias) {
		return getDaoFactory().getMagazineDao().searchMagazine(itemCriterias);
	}
	
	public ReservationResponse reserveItem(ItemDTO item, UserLightDTO user) {
		return getDaoFactory().getItemDao().reserveItem(item, user);
	}
	
	public ReservationResponse cancelItemReservation(Long itemId, UserLightDTO user) {
		return getDaoFactory().getItemDao().cancelItemReservation(itemId, user);
	}
}
