package org.liborrow.webservice.consumer.impl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.model.entities.Book;

public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void add(Book book)
	{
		em.persist(book);
	}
	
	public List<Book> listBooks()
	{
		return null;
	}
	
	
	
}
