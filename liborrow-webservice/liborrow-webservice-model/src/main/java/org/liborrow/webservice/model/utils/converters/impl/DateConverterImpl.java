package org.liborrow.webservice.model.utils.converters.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.liborrow.webservice.model.utils.converters.contract.DateConverter;

public class DateConverterImpl implements DateConverter {
	
	@Override
	public int convertDateToYearInt(Date date) {
		String yearString = new SimpleDateFormat("yyyy").format(date);
		int year = Integer.parseInt(yearString);
		return year;
	}
	
	@Override
	public Date convertYearIntToDate(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
}
