package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;

public class AuthorTransformerImpl implements AuthorTransformer {
	
	@Override
	public AuthorDTO toAuthorDto(Author author, final AuthorDependenciesEnum... authorDependenciesEnum)
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
		if(author.getBooks()!=null)
		{
			for(AuthorDependenciesEnum authorDependency : authorDependenciesEnum)
			{
				if(authorDependency.equals(AuthorDependenciesEnum.AUTHOR_BOOKS))
				{
					Set<BookDTO> booksTransformed = new HashSet<>();
					BookTransformerImpl bookTransformer = new BookTransformerImpl();
					for(Book book : author.getBooks())
					{
						booksTransformed.add(bookTransformer.toBookDTO(book,false, authorTransformed.getClass().getName()));
					}
					authorTransformed.setBooks(booksTransformed);
				}
			}
			
		}
		if(author.getCitizenships()!=null)
		{
			for(AuthorDependenciesEnum authorDependency : authorDependenciesEnum)
			{
				if(authorDependency.equals(AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS))
				{
					Set<CitizenshipDTO> citizenshipsTransformed = new HashSet<>();
					CitizenshipTransformer citizenshipTransformer = new CitizenshipTransformerImpl();
					citizenshipsTransformed.addAll(citizenshipTransformer.toCitizenshipsDTO(author.getCitizenships(), false, authorTransformed.getClass().getName()));
					authorTransformed.setCitizenships(citizenshipsTransformed);
				}
			}
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
	
	public Set<AuthorDTO> toAuthorsDTO(Set <Author> authors, final AuthorDependenciesEnum... authorDependenciesEnum)
	{
		Set<AuthorDTO> authorsDTO = new HashSet<>();
		for(Author author : authors)
		{
			AuthorDTO authorDTO = toAuthorDto(author, authorDependenciesEnum);
			authorsDTO.add(authorDTO);
		}
		return authorsDTO;
	}
	
	@Override
	public Author toAuthorEntity(AuthorDTO author, AuthorDependenciesEnum... authorDependenciesEnum) {
		Author authorTransformed = new Author();
		if(author.getBiography()!=null)
		{
			authorTransformed.setBiography(author.getBiography());
		}
		if((Integer) author.getBirth() !=null)
		{
			authorTransformed.setBirth(author.getBirth());
		}
		if(author.getBooks()!=null && (authorDependenciesEnum.equals(AuthorDependenciesEnum.AUTHOR_BOOKS)))
		{
			Set<Book> booksTransformed = new HashSet<>();
			BookTransformerImpl bookTransformer = new BookTransformerImpl();
			for(BookDTO book : author.getBooks())
			{
				booksTransformed.add(bookTransformer.toBookEntity(book,false, authorTransformed.getClass().getSimpleName()));
			}
			authorTransformed.setBooks(booksTransformed);
		}
		if(author.getCitizenships()!=null && (authorDependenciesEnum.equals(AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS)))
		{
			Set<Citizenship> citizenshipsTransformed = new HashSet<>();
			CitizenshipTransformer citizenshipTransformer = new CitizenshipTransformerImpl();
			citizenshipsTransformed.addAll(citizenshipTransformer.toCitizenshipsEntities(author.getCitizenships(), false, authorTransformed.getClass().getSimpleName()));
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
			authorTransformed.setImage(imageTransformer.toImageEntity(author.getImage(), false, authorTransformed.getClass().getSimpleName()));
		}
		return authorTransformed;
	}
	
	@Override
	public Set<Author> toAuthorsEntities(Set<AuthorDTO> authors, AuthorDependenciesEnum... authorDependenciesEnum) {
		Set<Author> authorsTransformed = new HashSet<>();
		for(AuthorDTO author : authors)
		{
			Author authorDTO = toAuthorEntity(author, authorDependenciesEnum);
			authorsTransformed.add(authorDTO);
		}
		return authorsTransformed;
	}
}
