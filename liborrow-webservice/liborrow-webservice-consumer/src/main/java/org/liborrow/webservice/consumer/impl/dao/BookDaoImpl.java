package org.liborrow.webservice.consumer.impl.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public class BookDaoImpl extends AbstractDaoImpl implements BookDao {
	
	
	
	public void add(Book book)
	{
		getEm().persist(book);
	}
	
	public Set<Book> listBooks()
	{
		return null;
	}
	
	@Override
	public Set<Book> searchBook(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct book FROM Book AS book LEFT JOIN FETCH book.authors LEFT JOIN FETCH book.borrows LEFT JOIN FETCH book.reservations WHERE 1=1 ");
		if(itemCriterias.getBookCriterias().getTitle()!=null && !itemCriterias.getBookCriterias().getTitle().equals("") )
		{
			queryString.append("AND (book.title LIKE :title ");
			queryString.append("OR book.title LIKE :titlelower ");
			queryString.append("OR book.title LIKE :titleupper ");
			queryString.append("OR book.title LIKE :titlewithfirstupper) ");
		}
		if(itemCriterias.getBookCriterias().getEditor() != null && !itemCriterias.getBookCriterias().getEditor().equals(""))
		{
			queryString.append("AND (book.editor LIKE :editor ");
			queryString.append("OR book.editor LIKE :editorlower ");
			queryString.append("OR book.editor LIKE :editorupper ");
			queryString.append("OR book.editor LIKE :editorwithfirstupper) ");
		}
		
		if(itemCriterias.getBookCriterias().getRelease() != null)
		{
			queryString.append("AND book.release LIKE :release");
		}
		
		if(itemCriterias.getItemRef() !=null && !itemCriterias.getItemRef().equals(""))
		{
			queryString.append("AND (book.itemRef LIKE :itemref ");
			queryString.append("OR book.itemRef LIKE :itemrefupper ");
			queryString.append("OR book.itemRef LIKE :itemreflower ");
			queryString.append("OR book.itemRef LIKE :itemrefwithfirstupper) ");
		}
		
		Query query = getEm().createQuery(queryString.toString());
		if(itemCriterias.getBookCriterias().getTitle()!=null && !itemCriterias.getBookCriterias().getTitle().equals("") )
		{
			query.setParameter("title", "%"+itemCriterias.getBookCriterias().getTitle()+"%");
			query.setParameter("titlelower", "%"+itemCriterias.getBookCriterias().getTitle().toLowerCase()+"%");
			query.setParameter("titleupper", "%"+itemCriterias.getBookCriterias().getTitle().toUpperCase()+"%");
			query.setParameter("titlewithfirstupper", "%"+itemCriterias.getBookCriterias().getTitle().substring(0, 1).toUpperCase()+itemCriterias.getBookCriterias().getTitle().substring(1).toLowerCase()+"%");
		}
		
		if(itemCriterias.getBookCriterias().getEditor() != null && !itemCriterias.getBookCriterias().getEditor().equals(""))
		{
			query.setParameter("editor", "%"+itemCriterias.getBookCriterias().getEditor()+"%");
			query.setParameter("editorlower", "%"+itemCriterias.getBookCriterias().getEditor().toLowerCase()+"%");
			query.setParameter("editorupper", "%"+itemCriterias.getBookCriterias().getEditor().toUpperCase()+"%");
			query.setParameter("editorwithfirstupper", "%"+itemCriterias.getBookCriterias().getEditor().substring(0, 1).toUpperCase()+itemCriterias.getBookCriterias().getEditor().substring(1).toLowerCase()+"%");
		}
		
		if(itemCriterias.getBookCriterias().getRelease() != null)
		{
			query.setParameter("release", itemCriterias.getBookCriterias().getRelease());
		}
		
		if(itemCriterias.getItemRef() !=null && !itemCriterias.getItemRef().equals(""))
		{
			query.setParameter("itemref", "%"+itemCriterias.getItemRef()+"%");
			query.setParameter("itemrefupper", "%"+itemCriterias.getItemRef().toUpperCase()+"%");
			query.setParameter("itemreflower", "%"+itemCriterias.getItemRef().toLowerCase()+"%");
			query.setParameter("itemrefwithfirstupper", "%"+itemCriterias.getItemRef().substring(0, 1).toUpperCase()+itemCriterias.getItemRef().substring(1).toLowerCase()+"%");
		}
		
		
		Set<Book> books = new HashSet<>();
		books.addAll(query.getResultList());
		return books;
	}
	
	@Override
	public Set<Book> searchWithSimpleStringBook(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct book FROM Book AS book LEFT JOIN FETCH book.authors LEFT JOIN FETCH book.borrows LEFT JOIN FETCH book.reservations WHERE 1=0 ");
		for(String string: simpleStringSplited)
		{
			queryString.append("OR book.title LIKE :title"+string+" ");
			queryString.append("OR book.title LIKE :titlelower"+string+" ");
			queryString.append("OR book.title LIKE :titleupper"+string+" ");
			queryString.append("OR book.title LIKE :titlewithfirstupper"+string+" ");
			queryString.append("OR book.editor LIKE :editor"+string+" ");
			queryString.append("OR book.editor LIKE :editorlower"+string+" ");
			queryString.append("OR book.editor LIKE :editorupper"+string+" ");
			queryString.append("OR book.editor LIKE :editorwithfirstupper"+string+" ");
			queryString.append("OR book.itemRef LIKE :itemref"+string+" ");
			queryString.append("OR book.itemRef LIKE :itemrefupper"+string+" ");
			queryString.append("OR book.itemRef LIKE :itemreflower"+string+" ");
			queryString.append("OR book.itemRef LIKE :itemrefwithfirstupper"+string+" ");
		}
		Query query = getEm().createQuery(queryString.toString());
		
		for(String string : simpleStringSplited)
		{
			query.setParameter("title"+string, "%"+string+"%");
			query.setParameter("titlelower"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("titleupper"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("titlewithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
			query.setParameter("editor"+string, "%"+string+"%");
			query.setParameter("editorlower"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("editorupper"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("editorwithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
			query.setParameter("itemref"+string, "%"+string+"%");
			query.setParameter("itemrefupper"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("itemreflower"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("itemrefwithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
		}
		
		Set<Book> books = new HashSet<>();
		books.addAll(query.getResultList());
		return books;
	}
}
