package org.liborrow.webservice.model.utils.impl;

import org.liborrow.webservice.model.utils.contract.UtilsFactory;
import org.liborrow.webservice.model.utils.converters.contract.ConvertersFactory;

public class UtilsFactoryImpl implements UtilsFactory {
	
	private ConvertersFactory convertersFactory;

	public ConvertersFactory getConvertersFactory() {
		return convertersFactory;
	}

	public void setConvertersFactory(ConvertersFactory convertersFactory) {
		this.convertersFactory = convertersFactory;
	}
}
