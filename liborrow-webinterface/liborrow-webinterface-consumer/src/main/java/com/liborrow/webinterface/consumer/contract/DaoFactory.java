package com.liborrow.webinterface.consumer.contract;

import com.liborrow.webinterface.consumer.contract.dao.BookDao;

public interface DaoFactory {
	BookDao getBookDao();
	 void setBookDao(BookDao bookDao);
}
