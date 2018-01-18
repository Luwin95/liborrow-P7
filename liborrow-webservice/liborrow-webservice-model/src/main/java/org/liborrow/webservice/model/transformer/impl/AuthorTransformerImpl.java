package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;

public class AuthorTransformerImpl implements AuthorTransformer {
	
	@Override
	public AuthorDTO toAuthorDto(Author author, boolean isParent)
	{
		AuthorDTO authorTransformed = new AuthorDTO();
		if(author.getBiography()!=null)
		{
			authorTransformed.setBiography(author.getBiography());
		}
		if((Integer) author.getBirth() !=null)
		{
			authorTransformed.setBirth(author.getBirth());
		}
		if(author.getBooks()!=null && isParent)
		{
			Set<BookDTO> booksTransformed = new HashSet<>();
			BookTransformerImpl bookTransformer = new BookTransformerImpl();
			for(Book book : author.getBooks())
			{
				booksTransformed.add(bookTransformer.toBookDTO(book,false));
			}
			authorTransformed.setBooks(booksTransformed);
		}
		if(author.getCitizenships()!=null)
		{
			
		}
		if((Integer) author.getDeath()!=null)
		{
			authorTransformed.setDeath(author.getDeath());
		}
		if(author.getFirstname()!=null)
		{
			authorTransformed.setFirstname(author.getFirstname());
		}
		if(author.getId() >0)
		{
			authorTransformed.setId(author.getId());
		}
		if(author.getName()!=null)
		{
			authorTransformed.setName(author.getName());
		}
		return authorTransformed;
	}
	
	public Set<AuthorDTO> toAuthorsDTO(Set <Author> authors, boolean isParent)
	{
		Set<AuthorDTO> authorsDTO = new HashSet<>();
		for(Author author : authors)
		{
			AuthorDTO authorDTO = toAuthorDto(author, isParent);
			authorsDTO.add(authorDTO);
		}
		return authorsDTO;
	}
}
