package com.liborrow.webinterface.business.impl;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.business.contract.manager.BookManager;
import com.liborrow.webinterface.business.contract.manager.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private BookManager bookManager;
	private UserManager userManager;
	
	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	
}
