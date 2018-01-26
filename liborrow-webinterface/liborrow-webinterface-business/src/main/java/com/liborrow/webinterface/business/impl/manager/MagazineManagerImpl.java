package com.liborrow.webinterface.business.impl.manager;

import com.liborrow.webinterface.business.contract.manager.MagazineManager;
import com.liborrow.webinterface.generated.model.MagazineDTO;

public class MagazineManagerImpl extends AbstractManagerImpl implements MagazineManager {
	public MagazineDTO getMagazineById(Integer id) {
		return getDaoFactory().getMagazineDao().find(id);
	}

}
