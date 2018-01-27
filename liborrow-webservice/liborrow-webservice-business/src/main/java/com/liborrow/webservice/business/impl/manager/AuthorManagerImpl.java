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
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.AuthorManager;

public class AuthorManagerImpl extends AbstractManagerImpl implements AuthorManager {

	@Override
	@Transactional(readOnly = true)
	public List<AuthorDTO> searchAuthor(ItemCriterias itemCriterias) {
		Set<Author> authors = getDaoFactory().getAuthorDao().searchAuthor(itemCriterias);
		List<AuthorDTO> authorsDTO = new ArrayList<>();
		if(authors!=null && authors.size()!=0)
		{
			authorListEntityHibernateLazyInitialization(authors);
			authorsDTO.addAll(getTransformerFactory().getAuthorTransformer().toAuthorsDTO(authors));
		}
		return authorsDTO;
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
	
	@Override
	public void authorListEntityHibernateLazyInitialization(Collection<Author> authors) {
		for(Author author : authors)
		{
			authorEntityHibernateLazyInitialization(author);
		}
	}
}
