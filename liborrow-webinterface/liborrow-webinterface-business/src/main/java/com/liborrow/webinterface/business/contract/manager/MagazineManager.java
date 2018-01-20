package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.itemservice.MagazineDTO;

public interface MagazineManager {

	MagazineDTO getMagazineById(Integer id);
}
