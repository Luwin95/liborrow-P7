package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.generated.model.BookDTO;

public class BookDaoImpl extends AbstractDao implements BookDao {
	
	public BookDTO find(Integer id)
	{
		return getItemSrv().getBook(id);
	}
}
