package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;

public class AuthorTransformerImpl implements AuthorTransformer {
	
	@Override
	public AuthorDTO toAuthorDto(Author author, boolean isParent, String classParentName)
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
		if(author.getBooks()!=null && (isParent||classParentName.equals("org.liborrow.webservice.model.dto.CitizenshipDTO")))
		{
			Set<BookDTO> booksTransformed = new HashSet<>();
			BookTransformerImpl bookTransformer = new BookTransformerImpl();
			for(Book book : author.getBooks())
			{
				booksTransformed.add(bookTransformer.toBookDTO(book,false, authorTransformed.getClass().getName()));
			}
			authorTransformed.setBooks(booksTransformed);
		}
		if(author.getCitizenships()!=null && (isParent||classParentName.equals("org.liborrow.webservice.model.dto.BookDTO")))
		{
			Set<CitizenshipDTO> citizenshipsTransformed = new HashSet<>();
			CitizenshipTransformer citizenshipTransformer = new CitizenshipTransformerImpl();
			citizenshipsTransformed.addAll(citizenshipTransformer.toCitizenshipsDTO(author.getCitizenships(), false, authorTransformed.getClass().getName()));
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
		if(author.getImage()!=null)
		{
			ImageTransformer imageTransformer = new ImageTransformerImpl();
			authorTransformed.setImage(imageTransformer.toImageDTO(author.getImage(), false, authorTransformed.getClass().getName()));
		}
		return authorTransformed;
	}
	
	public Set<AuthorDTO> toAuthorsDTO(Set <Author> authors, boolean isParent, String classParentName)
	{
		Set<AuthorDTO> authorsDTO = new HashSet<>();
		for(Author author : authors)
		{
			AuthorDTO authorDTO = toAuthorDto(author, isParent, classParentName);
			authorsDTO.add(authorDTO);
		}
		return authorsDTO;
	}
}
