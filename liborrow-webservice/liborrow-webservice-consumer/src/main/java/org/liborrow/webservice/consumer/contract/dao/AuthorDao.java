package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface AuthorDao {
	List<Author> searchAuthor(ItemCriterias itemCriterias);
}
