package com.liborrow.callagainbatch.consumer.impl;

import com.liborrow.callagainbatch.consumer.contract.DaoFactory;
import com.liborrow.callagainbatch.consumer.contract.dao.BorrowDao;

public class DaoFactoryImpl implements DaoFactory {
	private BorrowDao borrowDao;

	public BorrowDao getBorrowDao() {
		return borrowDao;
	}

	public void setBorrowDao(BorrowDao borrowDao) {
		this.borrowDao = borrowDao;
	}
	
	

}
