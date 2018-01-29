package org.liborrow.webservice.consumer.contract;

import org.liborrow.webservice.consumer.contract.dao.AuthorDao;
import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.consumer.contract.dao.BorrowDao;
import org.liborrow.webservice.consumer.contract.dao.MagazineDao;
import org.liborrow.webservice.consumer.contract.dao.UserDao;

public interface DaoFactory {
	AuthorDao getAuthorDao();
	void setAuthorDao(AuthorDao authorDao);
	BookDao getBookDao();
	void setBookDao(BookDao bookDao);
	MagazineDao getMagazineDao();
	void setMagazineDao(MagazineDao magazineDao);
	BorrowDao getBorrowDao();
	void setBorrowDao(BorrowDao borrowDao);
	UserDao getUserDao();
	void setUserDao(UserDao userDao);
}
