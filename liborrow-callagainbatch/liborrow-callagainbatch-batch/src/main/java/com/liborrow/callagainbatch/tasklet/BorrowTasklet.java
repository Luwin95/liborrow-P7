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
		emailAndBorrows = getManagerFactory().getBorrowManager().createChunkContextMap(borrows);
		if(emailAndBorrows.size()>=1)
		{
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("emailAndBorrows", emailAndBorrows);
		}
		return RepeatStatus.FINISHED;
	}

}
