package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.ItemManager;
import com.liborrow.webinterface.generated.model.itemservice.ItemCriterias;
import com.liborrow.webinterface.generated.model.itemservice.SearchResponse;

public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	
	public SearchResponse searchItem(ItemCriterias itemCriterias) {
		return getDaoFactory().getItemDao().searchItem(itemCriterias);
	}
}
