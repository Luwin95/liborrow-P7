package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.itemservice.MagazineDTO;

public interface MagazineDao {
	MagazineDTO find(Integer id);
	
}
