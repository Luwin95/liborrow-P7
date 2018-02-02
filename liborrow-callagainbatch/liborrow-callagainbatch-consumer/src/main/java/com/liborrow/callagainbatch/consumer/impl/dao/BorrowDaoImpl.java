package com.liborrow.callagainbatch.consumer.impl.dao;

import java.util.List;

import com.liborrow.callagainbatch.consumer.contract.dao.BorrowDao;
import com.liborrow.callagainbatch.consumer.impl.AbstractDaoImpl;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDao {
	public List<BorrowDTO> findLateBorrows() {
		return getBorrowSrv().findLateBorrows();
	}

}
