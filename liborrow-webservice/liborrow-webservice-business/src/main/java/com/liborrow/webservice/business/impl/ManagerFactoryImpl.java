package com.liborrow.webservice.business.impl;

import com.liborrow.webservice.business.contract.ManagerFactory;
import com.liborrow.webservice.business.contract.manager.AuthorManager;
import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.business.contract.manager.MagazineManager;
import com.liborrow.webservice.business.contract.manager.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private AuthorManager authorManager;
	private BookManager bookManager;
	private ItemManager itemManager;
	private MagazineManager magazineManager;
	private BorrowManager borrowManager;
	private UserManager userManager;
	
	@Override
	public AuthorManager getAuthorManager() {
		return authorManager;
	}

	@Override
	public void setAuthorManager(AuthorManager authorManager) {
		this.authorManager = authorManager;
	}

	@Override
	public BookManager getBookManager() {
		return bookManager;
	}

	@Override
	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}

	@Override
	public ItemManager getItemManager() {
		return itemManager;
	}

	@Override
	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}

	@Override
	public MagazineManager getMagazineManager() {
		return magazineManager;
	}

	@Override
	public void setMagazineManager(MagazineManager magazineManager) {
		this.magazineManager = magazineManager;
	}

	@Override
	public BorrowManager getBorrowManager() {
		return borrowManager;
	}

	@Override
	public void setBorrowManager(BorrowManager borrowManager) {
		this.borrowManager = borrowManager;
	}

	@Override
	public UserManager getUserManager() {
		return userManager;
	}

	@Override
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	
	
	
	
}
