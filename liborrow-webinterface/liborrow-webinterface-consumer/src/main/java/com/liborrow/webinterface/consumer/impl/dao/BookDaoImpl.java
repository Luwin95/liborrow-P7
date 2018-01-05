package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.generated.itemService.Book;

public class BookDaoImpl extends AbstractDao implements BookDao {
	
	public Book find(Integer id)
	{
		return getItemSrv().getBook(id);
	}
}
