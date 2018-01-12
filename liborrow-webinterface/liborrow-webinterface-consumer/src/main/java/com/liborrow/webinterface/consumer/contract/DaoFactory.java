package com.liborrow.webinterface.consumer.contract;

import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.consumer.contract.dao.ItemDao;
import com.liborrow.webinterface.consumer.contract.dao.UserDao;

public interface DaoFactory {
	BookDao getBookDao();
	 void setBookDao(BookDao bookDao);
	 UserDao getUserDao();
	 void setUserDao(UserDao userDao);
	 ItemDao getItemDao();
	 void setItemDao(ItemDao itemDao);
}
