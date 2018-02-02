package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.generated.model.BookDTO;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class BookDaoImpl extends AbstractDao implements BookDao {
	
	public BookDTO find(Integer id)
	{
		return getItemSrv().getBook(id);
	}
	
	public SearchResponse searchBook(ItemCriterias itemCriterias) {
		return  getItemSrv().searchBook(itemCriterias);
	}
}
