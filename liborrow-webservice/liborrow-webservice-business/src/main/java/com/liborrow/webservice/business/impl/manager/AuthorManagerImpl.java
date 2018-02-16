package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.AuthorManager;
import com.liborrow.webservice.consumer.repository.AuthorRepository;

public class AuthorManagerImpl extends AbstractManagerImpl implements AuthorManager {

	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<AuthorDTO> searchAuthor(ItemCriterias itemCriterias) {
		Set<Author> authors = getDaoFactory().getAuthorDao().searchAuthor(itemCriterias);
		List<AuthorDTO> authorsDTO = new ArrayList<>();
		if(authors!=null && authors.size()!=0)
		{
			authorListEntityHibernateLazyInitialization(authors);
			authorsDTO.addAll(getTransformerFactory().getAuthorTransformer().toAuthorsDTO(authors,AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS));
		}
		return authorsDTO;
	}
	
	@Override
	@Transactional
	public void createAuthor(AuthorDTO author) {
		Author authorEntity = getTransformerFactory().getAuthorTransformer().toAuthorEntity(author, AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS);
		authorRepository.save(authorEntity);
	}
	
	@Override
	@Transactional
	public void updateAuthor(AuthorDTO author) {
		Author authorEntity = getTransformerFactory().getAuthorTransformer().toAuthorEntity(author, AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS);
		authorRepository.save(authorEntity);
	}
	
	@Override
	@Transactional
	public void deleteAuthor(AuthorDTO author) {
		Author authorEntity = getTransformerFactory().getAuthorTransformer().toAuthorEntity(author, AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS);
		authorRepository.delete(authorEntity);
	}
	
	@Override
	public void authorEntityHibernateLazyInitialization(Author author) {
		Hibernate.initialize(author.getBooks());
		for(Book book : author.getBooks()){
			Hibernate.initialize(book.getAuthors());
			Hibernate.initialize(book.getImage());
			Hibernate.initialize(book.getBorrows());
			for(Borrow borrow : book.getBorrows())
			{
				Hibernate.initialize(borrow.getBorrower());
//				Hibernate.initialize(borrow.getBook());
//				Hibernate.initialize(borrow.getMagazine());
				Hibernate.initialize(borrow.getItem());
			}
		}
		Hibernate.initialize(author.getCitizenships());
		for(Citizenship citizenship : author.getCitizenships())
		{
			Hibernate.initialize(citizenship.getAuthors());
		}
	}
	
	@Override
	public void authorListEntityHibernateLazyInitialization(Collection<Author> authors) {
		for(Author author : authors)
		{
			authorEntityHibernateLazyInitialization(author);
		}
	}
}
