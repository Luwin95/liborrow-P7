package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.ItemDao;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class ItemDaoImpl extends AbstractDao implements ItemDao{

	public SearchResponse searchItem(ItemCriterias itemCriterias) {
		return getItemSrv().searchItem(itemCriterias);
	}
}
