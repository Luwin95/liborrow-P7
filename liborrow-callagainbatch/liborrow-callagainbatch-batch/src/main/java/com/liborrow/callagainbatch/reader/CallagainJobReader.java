package com.liborrow.callagainbatch.reader;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public class CallagainJobReader extends AbstractJob implements ItemReader<List<BorrowDTO>>{
	
	public List<BorrowDTO> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		List<BorrowDTO>  borrows = getManagerFactory().getBorrowManager().findLateBorrows();
		
		return null;
	}

}
