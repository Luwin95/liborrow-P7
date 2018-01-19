package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface AuthorManager {

	List<AuthorDTO> searchAuthor(ItemCriterias itemCriterias);
}
