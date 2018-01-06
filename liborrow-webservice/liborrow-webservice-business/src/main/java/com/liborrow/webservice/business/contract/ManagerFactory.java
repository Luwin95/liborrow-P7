package com.liborrow.webservice.business.contract;

import com.liborrow.webservice.business.contract.manager.BookManager;
import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.business.contract.manager.MagazineManager;
import com.liborrow.webservice.business.contract.manager.UserManager;

public interface ManagerFactory {
	BookManager getBookManager();
	void setBookManager(BookManager bookManager);
	ItemManager getItemManager();
	void setItemManager(ItemManager itemManager);
	MagazineManager getMagazineManager();
	void setMagazineManager(MagazineManager magazineManager);
	BorrowManager getBorrowManager();
	void setBorrowManager(BorrowManager borrowManager);
	UserManager getUserManager();
	void setUserManager(UserManager userManager);
}
