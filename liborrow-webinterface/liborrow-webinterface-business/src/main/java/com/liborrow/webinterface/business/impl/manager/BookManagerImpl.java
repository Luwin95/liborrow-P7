package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.BookManager;
import com.liborrow.webinterface.generated.model.BookDTO;

public class BookManagerImpl extends AbstractManagerImpl implements BookManager {
	public BookDTO getBookById(Integer id)
	{
		return getDaoFactory().getBookDao().find(id);
	}
}
