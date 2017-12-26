package com.liborrow.webservice.business.contract;

import com.liborrow.webservice.business.contract.manager.BookManager;

public interface ManagerFactory {
	BookManager getBookManager();
	void setBookManager(BookManager bookManager);
}
