package com.liborrow.callagainbatch.tasklet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class BorrowTasklet extends AbstractJob implements Tasklet, InitializingBean {
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		List<BorrowDTO> borrows= new ArrayList<BorrowDTO>();
		Map<String, List<String>> emailAndBorrows = new HashMap<String, List<String>>();
		borrows = getManagerFactory().getBorrowManager().findLateBorrows();
		UserLightDTO userTemp = new UserLightDTO();
		List<UserLightDTO> usersToContact = new ArrayList<UserLightDTO>();
		
		for(BorrowDTO borrow: borrows)
		{
			if(emailAndBorrows.containsKey(borrow.getBorrower().getEmail()))
			{
				List<String> borrowToSave = (List<String>) emailAndBorrows.get(borrow.getBorrower().getEmail());
				if(null!= borrow.getBookDTO() && borrow.getBookDTO().getId()!=0)
				{
					borrowToSave.add(borrow.getBookDTO().getTitle());
				}else{
					borrowToSave.add(borrow.getMagazineDTO().getName()+" n° "+borrow.getMagazineDTO().getEditionNumber());
				}
				emailAndBorrows.put(borrow.getBorrower().getEmail(), borrowToSave);
			}else {
				List<String> borrowToSave = new ArrayList<String>();
				if(null!= borrow.getBookDTO() && borrow.getBookDTO().getId()!=0)
				{
					borrowToSave.add(borrow.getBookDTO().getTitle());
				}else {
					borrowToSave.add(borrow.getMagazineDTO().getName()+" n° "+borrow.getMagazineDTO().getEditionNumber());
				}
				emailAndBorrows.put(borrow.getBorrower().getEmail(), borrowToSave);
			}
		}
		
		if(emailAndBorrows.size()>=1)
		{
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("emailAndBorrows", emailAndBorrows);
		}
		return RepeatStatus.FINISHED;
	}

}
