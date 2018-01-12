package com.liborrow.webservice.business.impl.manager;

import org.liborrow.webservice.consumer.contract.DaoFactory;

public abstract class AbstractManagerImpl {

	private DaoFactory daoFactory;

	protected DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
}
