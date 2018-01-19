package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface AuthorDao {
	Set<Author> searchAuthor(ItemCriterias itemCriterias);
	Set<Author> searchWithSimpleStringAuthor(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
