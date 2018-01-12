package org.liborrow.webservice.consumer.contract.dao;

import java.util.List;

import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface MagazineDao {
	List<Magazine> searchMagazine(ItemCriterias itemCriterias);
}
