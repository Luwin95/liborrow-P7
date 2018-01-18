package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.entities.Author;

public interface AuthorTransformer {

	AuthorDTO toAuthorDto(Author author, boolean isParent);
	public Set<AuthorDTO> toAuthorsDTO(Set<Author> authors, boolean isParent);
}
