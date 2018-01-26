package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.consumer.contract.dao.MagazineDao;
import com.liborrow.webinterface.generated.model.MagazineDTO;

public class MagazineDaoImpl extends AbstractDao implements MagazineDao {
	public MagazineDTO find(Integer id) {
		return getItemSrv().getMagazine(id);
	}
}
