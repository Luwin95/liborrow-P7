package com.liborrow.callagainbatch.business.impl.manager;

import java.util.List;

import com.liborrow.callagainbatch.business.contract.manager.BorrowManager;
import com.liborrow.callagainbatch.business.impl.AbstractManagerImpl;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager   {
	public List<BorrowDTO> findLateBorrows() {
		return getDaoFactory().getBorrowDao().findLateBorrows();
	}
}
