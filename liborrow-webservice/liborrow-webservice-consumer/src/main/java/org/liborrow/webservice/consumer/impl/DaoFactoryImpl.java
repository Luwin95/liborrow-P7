package org.liborrow.webservice.consumer.impl;

import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.consumer.contract.dao.AuthorDao;
import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.consumer.contract.dao.MagazineDao;

public class DaoFactoryImpl implements DaoFactory {
	private AuthorDao authorDao;
	private BookDao bookDao;
	private MagazineDao magazineDao;
	
	@Override
	public AuthorDao getAuthorDao() {
		return authorDao;
	}
	
	@Override
	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	@Override
	public BookDao getBookDao() {
		return bookDao;
	}
	
	@Override
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public MagazineDao getMagazineDao() {
		return magazineDao;
	}
	
	@Override
	public void setMagazineDao(MagazineDao magazineDao) {
		this.magazineDao = magazineDao;
	}
}
