package com.liborrow.callagainbatch.tasklet;

import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class GetWaitingListObsoleteTasklet extends AbstractJob implements Tasklet, InitializingBean  {
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		List <WaitingListDTO> reservations = getManagerFactory().getReservationManager().getWaitingListByNotificationDateObsolete();
		if(reservations.size()>=1)
		{
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("reservationsObsolete", reservations);
		}
		return RepeatStatus.FINISHED;
	}
}
