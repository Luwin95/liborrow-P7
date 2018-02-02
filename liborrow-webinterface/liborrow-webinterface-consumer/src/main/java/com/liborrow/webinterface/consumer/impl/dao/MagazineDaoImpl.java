package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.MagazineDao;
import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.MagazineDTO;
import com.liborrow.webinterface.generated.model.SearchResponse;

public class MagazineDaoImpl extends AbstractDao implements MagazineDao {
	public MagazineDTO find(Integer id) {
		return getItemSrv().getMagazine(id);
	}
	
	public SearchResponse searchMagazine(ItemCriterias itemCriterias) {
		return getItemSrv().searchMagazine(itemCriterias);
	}
}
