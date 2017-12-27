package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Magazine;

public interface MagazineManager {
	Magazine findMagazineById(long id);
	List<Magazine> findAllMagazines();
}
