package com.liborrow.callagainbatch.business.impl;

import com.liborrow.callagainbatch.consumer.contract.DaoFactory;

public class AbstractManagerImpl {
	private DaoFactory daoFactory;

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	

}
