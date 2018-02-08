package com.liborrow.callagainbatch.reader;

import java.util.List;
import java.util.Map;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public class CallagainJobReader extends AbstractJob implements ItemReader<BorrowDTO>{
	private Map<String, List<BorrowDTO>> emailAndBorrows;
	private int nextBorrowIndex;
	
	public BorrowDTO read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		return null;
	}
}
