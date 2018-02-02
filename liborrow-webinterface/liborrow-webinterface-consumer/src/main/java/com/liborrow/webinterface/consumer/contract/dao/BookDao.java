package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public interface BookDao {
	BookDTO find(Integer id);
	
	SearchResponse searchBook(ItemCriterias itemCriterias);
}
