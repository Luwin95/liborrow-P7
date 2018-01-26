package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;

public interface AuthorTransformer {

	AuthorDTO toAuthorDto(Author author, final AuthorDependenciesEnum... authorDependenciesEnum);
	public Set<AuthorDTO> toAuthorsDTO(Set<Author> authors, final AuthorDependenciesEnum... authorDependenciesEnum);
	Author toAuthorEntity(AuthorDTO author, final AuthorDependenciesEnum... authorDependenciesEnum);
	public Set<Author> toAuthorsEntities(Set<AuthorDTO> authors, final AuthorDependenciesEnum... authorDependenciesEnum);
}
