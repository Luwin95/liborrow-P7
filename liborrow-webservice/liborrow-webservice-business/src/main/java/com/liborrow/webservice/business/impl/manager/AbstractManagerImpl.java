package com.liborrow.webservice.business.impl.manager;

import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.model.transformer.contract.TransformerFactory;

public abstract class AbstractManagerImpl {

	private DaoFactory daoFactory;
	private TransformerFactory transformerFactory;

	protected DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public TransformerFactory getTransformerFactory() {
		return transformerFactory;
	}

	public void setTransformerFactory(TransformerFactory transformerFactory) {
		this.transformerFactory = transformerFactory;
	}
	
	
}
