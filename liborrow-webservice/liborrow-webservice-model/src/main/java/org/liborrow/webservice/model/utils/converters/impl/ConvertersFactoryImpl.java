package org.liborrow.webservice.model.utils.converters.impl;

import org.liborrow.webservice.model.utils.converters.contract.ConvertersFactory;
import org.liborrow.webservice.model.utils.converters.contract.DateConverter;

public class ConvertersFactoryImpl implements ConvertersFactory {
	DateConverter dateConverter;

	public DateConverter getDateConverter() {
		return dateConverter;
	}

	public void setDateConverter(DateConverter dateConverter) {
		this.dateConverter = dateConverter;
	}
	
	

}
