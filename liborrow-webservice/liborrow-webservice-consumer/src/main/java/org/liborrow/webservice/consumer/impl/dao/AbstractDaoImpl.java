package org.liborrow.webservice.consumer.impl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.liborrow.webservice.model.utils.contract.UtilsFactory;

public class AbstractDaoImpl {
	@PersistenceContext
	private EntityManager em;
	
	private UtilsFactory utilsFactory;

	protected EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public UtilsFactory getUtilsFactory() {
		return utilsFactory;
	}

	public void setUtilsFactory(UtilsFactory utilsFactory) {
		this.utilsFactory = utilsFactory;
	}

}
