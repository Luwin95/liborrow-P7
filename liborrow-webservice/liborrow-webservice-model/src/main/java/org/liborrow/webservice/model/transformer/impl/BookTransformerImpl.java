package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;

public class BookTransformerImpl implements BookTransformer {

	@Override
	public BookDTO toBookDTO(Book book, boolean isParent)
	{
		BookDTO transformedBook = new BookDTO();
		if(book.getAlley()!=null)
		{
			transformedBook.setAlley(book.getAlley());
		}
		if(book.getAuthors()!=null && isParent)
		{
			Set<AuthorDTO> authorsTransformed = new HashSet<>();
			AuthorTransformerImpl authorTransformer = new AuthorTransformerImpl();
			for(Author author : book.getAuthors())
			{
				authorsTransformed.add(authorTransformer.toAuthorDto(author, false));
			}
			transformedBook.setAuthors(authorsTransformed);
		}
		if(book.getBorrows() !=null && isParent)
		{
			BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			transformedBook.setBorrows(borrowTransformer.toBorrowsDTO(book.getBorrows(), true));
		}
		if(book.getEditor()!=null)
		{
			transformedBook.setEditor(book.getEditor());
		}
		if(book.getId()!=null)
		{
			transformedBook.setId(book.getId());
		}
		if(book.getItemRef()!=null)
		{
			transformedBook.setItemRef(book.getItemRef());
		}
		if(book.getLanguage()!=null)
		{
			transformedBook.setLanguage(book.getLanguage());
		}
		if(book.getPlace()!=null)
		{
			transformedBook.setPlace(book.getPlace());
		}
		if(book.getRelease()!=null)
		{
			transformedBook.setRelease(book.getRelease());
		}
		if(book.getRemainingCount()>=0)
		{
			transformedBook.setRemainingCount(book.getRemainingCount());
		}
		if(book.getSummary()!=null)
		{
			transformedBook.setSummary(book.getSummary());
		}
		if(book.getTitle()!=null)
		{
			transformedBook.setTitle(book.getTitle());
		}
		if(book.getTotalCount()>=0)
		{
			transformedBook.setTotalCount(book.getTotalCount());
		}
		return transformedBook;
	}
	
	@Override
	public Set<BookDTO> toBooksDTO(Set<Book> books, boolean isParent)
	{
		Set<BookDTO> booksTransformed = new HashSet<>();
		for(Book book : books)
		{
			booksTransformed.add(toBookDTO(book, isParent));
		}
		return booksTransformed;
	}
}