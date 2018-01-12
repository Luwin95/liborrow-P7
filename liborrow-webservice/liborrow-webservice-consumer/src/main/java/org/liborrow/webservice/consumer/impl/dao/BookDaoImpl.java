package org.liborrow.webservice.consumer.impl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

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
	
	@Override
	public List<Book> searchBook(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT book FROM Book AS book  WHERE 1=1 ");
		if(!itemCriterias.getBookCriterias().getTitle().equals(""))
		{
			queryString.append("AND book.title LIKE :title ");
		}
		if(itemCriterias.getBookCriterias().getEditor() != null)
		{
			queryString.append("AND book.editor LIKE :editor");
		}
		if(itemCriterias.getBookCriterias().getRelease() != null)
		{
			queryString.append("AND book.release LIKE :release");
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
		return (List <Book>) query.getResultList();
	}
}
