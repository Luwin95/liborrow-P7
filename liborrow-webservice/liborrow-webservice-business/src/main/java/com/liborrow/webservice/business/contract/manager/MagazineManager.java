package com.liborrow.webservice.business.contract.manager;

import java.util.List;

import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public interface MagazineManager {
	MagazineDTO findMagazineById(long id);
	List<MagazineDTO> findAllMagazines();
	List<MagazineDTO> searchMagazine(ItemCriterias itemCriterias);
	void createMagazine(MagazineDTO magazine);
	void updateMagazine(MagazineDTO magazine);
	void deleteMagazine(MagazineDTO magazine);
}
