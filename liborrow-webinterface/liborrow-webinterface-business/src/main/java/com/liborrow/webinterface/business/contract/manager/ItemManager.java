package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.itemservice.ItemCriterias;
import com.liborrow.webinterface.generated.model.itemservice.SearchResponse;

public interface ItemManager {
	
	SearchResponse searchItem(ItemCriterias itemCriterias);
}
