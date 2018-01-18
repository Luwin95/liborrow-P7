package org.liborrow.webservice.consumer.impl.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.transformer.impl.BookTransformerImpl;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void add(Book book)
	{
		em.persist(book);
	}
	
	public Set<Book> listBooks()
	{
		return null;
	}
	
	@Override
	public Set<BookDTO> searchBook(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct book FROM Book AS book JOIN FETCH book.authors JOIN FETCH book.borrows  WHERE 1=1 ");
		if(!itemCriterias.getBookCriterias().getTitle().equals(""))
		{
			queryString.append("OR book.title LIKE :title ");
		}
		if(itemCriterias.getBookCriterias().getEditor() != null)
		{
			queryString.append("OR book.editor LIKE :editor");
		}
		if(itemCriterias.getBookCriterias().getRelease() != null)
		{
			queryString.append("OR book.release LIKE :release");
		}
		
		Query query = em.createQuery(queryString.toString());
		if(!itemCriterias.getBookCriterias().getTitle().equals(""))
		{
			query.setParameter("title", "%"+itemCriterias.getBookCriterias().getTitle()+"%");
		}
		if(itemCriterias.getBookCriterias().getEditor()!=null)
		{
			query.setParameter("editor", itemCriterias.getBookCriterias().getEditor());
		}
		if(itemCriterias.getBookCriterias().getRelease() != null)
		{
			query.setParameter("release", itemCriterias.getBookCriterias().getRelease());
		}
		
		Set<Book> books = new HashSet<>();
		books.addAll(query.getResultList());
		BookTransformerImpl bookTransformer = new BookTransformerImpl();
		return bookTransformer.toBooksDTO(books);
	}
	
	public void bookEntityHibernateInitialization(Book book)
	{
		Hibernate.initialize(book.getAuthors());
		
	}
}
