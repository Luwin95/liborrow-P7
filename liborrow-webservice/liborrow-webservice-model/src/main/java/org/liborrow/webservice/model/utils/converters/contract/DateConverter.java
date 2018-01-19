package org.liborrow.webservice.model.utils.converters.contract;

import java.util.Date;

public interface DateConverter {

	Date convertYearIntToDate(int year);
	int convertDateToYearInt(Date date);
}
