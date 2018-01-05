package com.liborrow.webinterface.consumer.impl;

import com.liborrow.webinterface.consumer.contract.DaoFactory;
import com.liborrow.webinterface.consumer.contract.dao.BookDao;

public class DaoFactoryImpl implements DaoFactory {

	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
