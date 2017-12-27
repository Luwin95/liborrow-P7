package com.liborrow.webservice.business.impl;

import com.liborrow.webservice.business.contract.ManagerFactory;
import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.business.contract.manager.MagazineManager;

public class ManagerFactoryImpl implements ManagerFactory {
	private BookManager bookManager;
	private ItemManager itemManager;
	private MagazineManager magazineManager;
	
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
	
	
	
}
