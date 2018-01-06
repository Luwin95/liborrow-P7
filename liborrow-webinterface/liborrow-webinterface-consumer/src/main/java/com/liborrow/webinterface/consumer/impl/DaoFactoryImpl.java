package com.liborrow.webinterface.consumer.impl;

import com.liborrow.webinterface.consumer.contract.DaoFactory;
import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.consumer.contract.dao.UserDao;

public class DaoFactoryImpl implements DaoFactory {

	private BookDao bookDao;
	private UserDao userDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
