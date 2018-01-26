package com.liborrow.webservice.business.contract.manager;

import java.util.Collection;
import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface AuthorManager {

	List<AuthorDTO> searchAuthor(ItemCriterias itemCriterias);
	void authorEntityHibernateLazyInitialization(Author author);
	void authorListEntityHibernateLazyInitialization(Collection<Author> authors);
}
