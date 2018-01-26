package com.liborrow.webinterface.business.impl;

import com.liborrow.webinterface.business.contract.ManagerFactory;
import com.liborrow.webinterface.business.contract.manager.BookManager;
import com.liborrow.webinterface.business.contract.manager.BorrowManager;
import com.liborrow.webinterface.business.contract.manager.ItemManager;
import com.liborrow.webinterface.business.contract.manager.MagazineManager;
import com.liborrow.webinterface.business.contract.manager.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private BookManager bookManager;
	private UserManager userManager;
	private ItemManager itemManager;
	private MagazineManager magazineManager;
	private BorrowManager borrowManager;
	
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

	public ItemManager getItemManager() {
		return itemManager;
	}

	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}

	public MagazineManager getMagazineManager() {
		return magazineManager;
	}

	public void setMagazineManager(MagazineManager magazineManager) {
		this.magazineManager = magazineManager;
	}

	public BorrowManager getBorrowManager() {
		return borrowManager;
	}

	public void setBorrowManager(BorrowManager borrowManager) {
		this.borrowManager = borrowManager;
	}
}
