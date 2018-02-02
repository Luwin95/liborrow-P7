package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public interface ItemManager {
	
	SearchResponse searchItem(ItemCriterias itemCriterias);
	SearchResponse findLastFiveItems();
	SearchResponse searchBook(ItemCriterias itemCriterias);
	SearchResponse searchAuthor(ItemCriterias itemCriterias);
	SearchResponse searchMagazine(ItemCriterias itemCriterias);
}
