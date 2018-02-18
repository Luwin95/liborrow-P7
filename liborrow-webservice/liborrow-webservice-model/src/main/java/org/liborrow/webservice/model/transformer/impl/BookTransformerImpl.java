package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;

public class BookTransformerImpl extends AbstractTransformerImpl implements BookTransformer {

	@Override
	public BookDTO toBookDTO(Book book, boolean isParent, String classParentName)
	{
		BookDTO transformedBook = new BookDTO();
		transformedBook.setItemType("book");
		if(book.getAlley()!=null)
		{
			transformedBook.setAlley(book.getAlley());
		}
		if(book.getAuthors()!=null && (isParent||classParentName.equals("org.liborrow.webservice.model.dto.BorrowDTO")))
		{
			Set<AuthorDTO> authorsTransformed = new HashSet<>();
			AuthorTransformerImpl authorTransformer = new AuthorTransformerImpl();
			for(Author author : book.getAuthors())
			{
				authorsTransformed.add(authorTransformer.toAuthorDto(author, AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS));
			}
			transformedBook.setAuthors(authorsTransformed);
		}
		if(book.getBorrows() !=null && (isParent|| classParentName.equals("org.liborrow.webservice.model.dto.AuthorDTO")))
		{
			BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			transformedBook.setBorrows(borrowTransformer.toBorrowsDTO(book.getBorrows(), true, transformedBook.getClass().getName()));
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
		if(book.getImage()!=null)
		{
			ImageTransformer imageTransformer = new ImageTransformerImpl();
			transformedBook.setImage(imageTransformer.toImageDTO(book.getImage(), false, transformedBook.getClass().getName()));
		}
		return transformedBook;
	}
	
	@Override
	public Set<BookDTO> toBooksDTO(Set<Book> books, boolean isParent, String classParentName)
	{
		Set<BookDTO> booksTransformed = new HashSet<>();
		for(Book book : books)
		{
			booksTransformed.add(toBookDTO(book, isParent, classParentName));
		}
		return booksTransformed;
	}
	
	@Override
	public Book toBookEntity(BookDTO book, boolean isParent, String classParentName) {
		Book transformedBook = new Book();
		if(book.getAlley()!=null)
		{
			transformedBook.setAlley(book.getAlley());
		}
		if(book.getAuthors()!=null && (isParent||classParentName.equals(Borrow.class.getSimpleName())))
		{
			Set<Author> authorsTransformed = new HashSet<>();
			AuthorTransformerImpl authorTransformer = new AuthorTransformerImpl();
			for(AuthorDTO author : book.getAuthors())
			{
				Author authorEntity = getEm().find(Author.class, author.getId());
				authorsTransformed.add(authorEntity);
			}
			transformedBook.setAuthors(authorsTransformed);
		}
		if(book.getBorrows() !=null && (isParent|| classParentName.equals(Author.class.getSimpleName())))
		{
			BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			transformedBook.setBorrows(borrowTransformer.toBorrowsEntities(book.getBorrows(), true, transformedBook.getClass().getSimpleName()));
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
		if(book.getImage()!=null)
		{
			ImageTransformer imageTransformer = new ImageTransformerImpl();
			transformedBook.setImage(imageTransformer.toImageEntity(book.getImage(), false, transformedBook.getClass().getSimpleName()));
		}
		return transformedBook;
	}
	
	@Override
	public Set<Book> toBooksEntities(Set<BookDTO> books, boolean isParent, String classParentName) {
		Set<Book> booksTransformed = new HashSet<>();
		for(BookDTO book : books)
		{
			booksTransformed.add(toBookEntity(book, isParent, classParentName));
		}
		return booksTransformed;
	}
}
