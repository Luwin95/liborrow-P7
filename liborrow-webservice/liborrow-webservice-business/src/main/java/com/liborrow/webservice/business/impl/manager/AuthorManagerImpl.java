package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

import com.liborrow.webservice.business.contract.manager.AuthorManager;

public class AuthorManagerImpl extends AbstractManagerImpl implements AuthorManager {

	@Override
	public List<AuthorDTO> searchAuthor(ItemCriterias itemCriterias) {
		Set<Author> authors = getDaoFactory().getAuthorDao().searchAuthor(itemCriterias);
		List<AuthorDTO> authorsDTO = new ArrayList<>();
		if(authors!=null)
		{
			authorsDTO.addAll(getTransformerFactory().getAuthorTransformer().toAuthorsDTO(authors, true));
		}
		return authorsDTO;
	}
}
