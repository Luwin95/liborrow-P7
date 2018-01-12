package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.itemservice.ItemCriterias;
import com.liborrow.webinterface.generated.model.itemservice.SearchResponse;

public interface ItemDao {

	SearchResponse searchItem(ItemCriterias itemCriterias);
}
