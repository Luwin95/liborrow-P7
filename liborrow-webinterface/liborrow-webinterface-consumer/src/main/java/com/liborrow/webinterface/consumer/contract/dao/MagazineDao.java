package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.MagazineDTO;

public interface MagazineDao {
	MagazineDTO find(Integer id);
	
}
