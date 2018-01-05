package com.liborrow.webinterface.business.impl;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.business.contract.manager.BookManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private BookManager bookManager;

	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
}
