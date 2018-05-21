package com.liborrow.callagainbatch.tasklet;

import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class DeleteWaitingListObsoleteTasklet extends AbstractJob implements Tasklet, InitializingBean   {
	public void afterPropertiesSet() throws Exception {
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		getManagerFactory().getReservationManager().removeWaitingListObsolete((List<Long>) chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("reservationsObsolete"));
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().remove("reservationsObsolete");
		return RepeatStatus.FINISHED;
	}
}
