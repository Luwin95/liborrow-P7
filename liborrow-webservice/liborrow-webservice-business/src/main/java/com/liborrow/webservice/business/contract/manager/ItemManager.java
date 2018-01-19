package com.liborrow.webservice.business.contract.manager;

import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;

public interface ItemManager {
	Item findItemById(long id);
	SearchResponse searchWithSimpleString(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
