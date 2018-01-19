package org.liborrow.webservice.model.utils.converters.contract;

public interface ConvertersFactory {

	DateConverter getDateConverter();
	void setDateConverter(DateConverter dateConverter);
}
