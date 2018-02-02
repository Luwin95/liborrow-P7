package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;

public interface MagazineDao {
	MagazineDTO find(Integer id);
	SearchResponse searchMagazine(ItemCriterias itemCriterias);
	
}
