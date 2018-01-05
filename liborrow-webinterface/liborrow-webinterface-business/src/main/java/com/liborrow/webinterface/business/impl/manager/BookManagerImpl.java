package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.BookManager;
import com.liborrow.webinterface.generated.itemService.Book;

public class BookManagerImpl extends AbstractManagerImpl implements BookManager {
	public Book getBookById(Integer id)
	{
		return getDaoFactory().getBookDao().find(id);
	}
}
