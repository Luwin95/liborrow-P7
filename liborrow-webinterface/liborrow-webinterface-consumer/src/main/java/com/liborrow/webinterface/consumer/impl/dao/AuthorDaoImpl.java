package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.AuthorDao;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class AuthorDaoImpl extends AbstractDao implements AuthorDao {
	public SearchResponse searchAuthor(ItemCriterias itemCriterias) {
		return getItemSrv().searchAuthor(itemCriterias);
	}

}
