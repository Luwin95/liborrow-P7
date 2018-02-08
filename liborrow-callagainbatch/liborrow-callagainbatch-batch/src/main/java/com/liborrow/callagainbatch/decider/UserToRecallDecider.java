package com.liborrow.callagainbatch.decider;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

public class UserToRecallDecider implements JobExecutionDecider{
	
	public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
		FlowExecutionStatus status = null;
		
		try {
			if(jobExecution.getExecutionContext().containsKey("emailAndBorrows"))
			{
				status = new FlowExecutionStatus("COMPLETED");
			}else {
				status = new FlowExecutionStatus("EMPTY");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}
