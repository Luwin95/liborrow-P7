package com.liborrow.webservice.business.impl.manager;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.consumer.repository.AuthorRepository;
import com.liborrow.webservice.consumer.repository.BookRepository;
import com.liborrow.webservice.consumer.repository.ItemRepository;
import com.liborrow.webservice.consumer.repository.MagazineRepository;


@Service
public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	@Autowired
	@Resource
	ItemRepository itemRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	MagazineRepository magazineRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Item findItemById(long id)
	{
		return itemRepository.findOne(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public SearchResponse searchWithSimpleString(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		SearchResponse searchResponse = new SearchResponse();
		searchResponse.getAuthors().addAll(
				getTransformerFactory().getAuthorTransformer().toAuthorsDTO(
						getDaoFactory().getAuthorDao().searchWithSimpleStringAuthor(itemCriterias, simpleStringSplited),AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS)
				);
		searchResponse.getBooks().addAll(
				getTransformerFactory().getBookTransformer().toBooksDTO(
						getDaoFactory().getBookDao().searchWithSimpleStringBook(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.BookDTO")
				);
		searchResponse.getMagazines().addAll(
				getTransformerFactory().getMagazineTransformer().toMagazinesDTO(
						getDaoFactory().getMagazineDao().searchWithSimpleStringMagazine(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.MagazineDTO")
				);
		return searchResponse;
	}
	
	@Override
	@Transactional(readOnly = true)
	public SearchResponse getLastFiveItems() {
		SearchResponse searchResponse = new SearchResponse();
		Set<Book> books = bookRepository.findTop5ByOrderByIdDesc();
		Set<Author> authors = authorRepository.findTop5ByOrderByIdDesc();
		Set<Magazine> magazines = magazineRepository.findTop5ByOrderByIdDesc();
		bookListEntityHibernateInitialization(books);
		authorListEntityHibernateLazyInitialization(authors);
		magazinesEntityHibernateInitialization(magazines);
		searchResponse.getBooks().addAll(
				getTransformerFactory().getBookTransformer().toBooksDTO(books, true, BookDTO.class.getSimpleName()));
		searchResponse.getAuthors().addAll(
				getTransformerFactory().getAuthorTransformer().toAuthorsDTO(authors,AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS));
		searchResponse.getMagazines().addAll(
				getTransformerFactory().getMagazineTransformer().toMagazinesDTO(magazines, true, MagazineDTO.class.getSimpleName()));
		return searchResponse;
	}
	
	private void bookEntityHibernateInitialization(Book book)
	{
		Hibernate.initialize(book.getImage());
		Hibernate.initialize(book.getAuthors());
		for(Author author : book.getAuthors())
		{
			Hibernate.initialize(author.getBooks());
			Hibernate.initialize(author.getCitizenships());
			for(Citizenship citizenship : author.getCitizenships())
			{
				Hibernate.initialize(citizenship.getAuthors());
			}
		}
		Hibernate.initialize(book.getBorrows());
		for(Borrow borrow : book.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
			Hibernate.initialize(borrow.getBook());
			Hibernate.initialize(borrow.getMagazine());
		}
	}
	
	private void bookListEntityHibernateInitialization(Collection<Book> books) {
		for(Book book : books)
		{
			bookEntityHibernateInitialization(book);
		}
	}
	
	private void authorEntityHibernateLazyInitialization(Author author) {
		Hibernate.initialize(author.getBooks());
		for(Book book : author.getBooks()){
			Hibernate.initialize(book.getAuthors());
			Hibernate.initialize(book.getImage());
			Hibernate.initialize(book.getBorrows());
			for(Borrow borrow : book.getBorrows())
			{
				Hibernate.initialize(borrow.getBorrower());
				Hibernate.initialize(borrow.getBook());
				Hibernate.initialize(borrow.getMagazine());
			}
		}
		Hibernate.initialize(author.getCitizenships());
		for(Citizenship citizenship : author.getCitizenships())
		{
			Hibernate.initialize(citizenship.getAuthors());
		}
	}
	
	private void authorListEntityHibernateLazyInitialization(Collection<Author> authors) {
		for(Author author : authors)
		{
			authorEntityHibernateLazyInitialization(author);
		}
	}
	
	private void magazineEntityHibernateInitialization(Magazine magazine)
	{
		Hibernate.initialize(magazine.getBorrows());
		Hibernate.initialize(magazine.getImage());
		for(Borrow borrow : magazine.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
			Hibernate.initialize(borrow.getBorrower().getCitizenship());
		}
	}
	
	private void magazinesEntityHibernateInitialization(Collection<Magazine> magazines)
	{
		for(Magazine magazine : magazines)
		{
			magazineEntityHibernateInitialization(magazine);
		}
	}

}
