package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public interface AuthorDao {
	SearchResponse searchAuthor(ItemCriterias itemCriterias);
}
