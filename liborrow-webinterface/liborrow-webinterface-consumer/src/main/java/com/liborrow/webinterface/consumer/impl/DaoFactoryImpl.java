package com.liborrow.webinterface.consumer.impl;

import com.liborrow.webinterface.consumer.contract.DaoFactory;
import com.liborrow.webinterface.consumer.contract.dao.AuthorDao;
import com.liborrow.webinterface.consumer.contract.dao.BookDao;
import com.liborrow.webinterface.consumer.contract.dao.BorrowDao;
import com.liborrow.webinterface.consumer.contract.dao.ItemDao;
import com.liborrow.webinterface.consumer.contract.dao.MagazineDao;
import com.liborrow.webinterface.consumer.contract.dao.UserDao;

public class DaoFactoryImpl implements DaoFactory {

	private BookDao bookDao;
	private UserDao userDao;
	private ItemDao itemDao;
	private MagazineDao magazineDao;
	private BorrowDao borrowDao;
	private AuthorDao authorDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public MagazineDao getMagazineDao() {
		return magazineDao;
	}

	public void setMagazineDao(MagazineDao magazineDao) {
		this.magazineDao = magazineDao;
	}

	public BorrowDao getBorrowDao() {
		return borrowDao;
	}

	public void setBorrowDao(BorrowDao borrowDao) {
		this.borrowDao = borrowDao;
	}

	public AuthorDao getAuthorDao() {
		return authorDao;
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
}
