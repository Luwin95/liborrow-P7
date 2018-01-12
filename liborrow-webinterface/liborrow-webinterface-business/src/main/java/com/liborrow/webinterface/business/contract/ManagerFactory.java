package com.liborrow.webinterface.business.contract;

import com.liborrow.webinterface.business.contract.manager.BookManager;
import com.liborrow.webinterface.business.contract.manager.ItemManager;
import com.liborrow.webinterface.business.contract.manager.UserManager;

public interface ManagerFactory {
	BookManager getBookManager();
	void setBookManager(BookManager bookManager);
	UserManager getUserManager();
	void setUserManager(UserManager userManager);
	ItemManager getItemManager();
	void setItemManager(ItemManager itemManager);
}
