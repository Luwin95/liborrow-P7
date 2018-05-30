package com.liborrow.callagainbatch.tasklet;

import java.util.List;
import java.util.Map;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;

public class ReorganizePositionInWaitingListTasklet extends AbstractJob implements Tasklet, InitializingBean  {

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		getManagerFactory().getReservationManager().reorganizePositionInWaitingList((Map<Long, Long>) chunkContext.getStepContext().getJobExecutionContext().get("itemsToModify"));
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().remove("itemsToModify");
		return RepeatStatus.FINISHED;
	}
}
