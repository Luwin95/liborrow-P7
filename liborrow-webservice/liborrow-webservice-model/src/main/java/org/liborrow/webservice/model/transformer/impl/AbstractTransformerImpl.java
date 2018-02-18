package org.liborrow.webservice.model.transformer.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractTransformerImpl {

	@PersistenceContext
	private EntityManager em;
	
	protected EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
