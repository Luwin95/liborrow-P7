package com.liborrow.webinterface.business.contract;

import com.liborrow.webinterface.business.contract.manager.BookManager;

public interface ManagerFactory {
	BookManager getBookManager();
	void setBookManager(BookManager bookManager);
}
