package com.liborrow.webservice.business.impl;

import com.liborrow.webservice.business.contract.ManagerFactory;
import com.liborrow.webservice.business.contract.manager.BookManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private BookManager bookManager;

	@Override
	public BookManager getBookManager() {
		return bookManager;
	}

	@Override
	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
}
