package org.liborrow.webservice.consumer.contract.dao;

import java.util.Set;

import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface MagazineDao {
	Set<Magazine> searchMagazine(ItemCriterias itemCriterias);
	Set<Magazine> searchWithSimpleStringMagazine(ItemCriterias itemCriterias, String[] simpleStringSplited);
}
