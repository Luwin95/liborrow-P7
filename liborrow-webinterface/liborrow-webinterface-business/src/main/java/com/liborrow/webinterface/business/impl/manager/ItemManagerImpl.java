package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.ItemManager;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	
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
}
