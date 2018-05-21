package com.liborrow.callagainbatch.tasklet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class GetWaitingListObsoleteTasklet extends AbstractJob implements Tasklet, InitializingBean  {
	
	private List <WaitingListDTO> reservations = new ArrayList<WaitingListDTO>();
	
	private List<Long> waitingListToDelete =  new ArrayList<Long>();
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		reservations = getManagerFactory().getReservationManager().getWaitingListByNotificationDateObsolete();
		
		if(reservations.size()>=1)
		{
			List<Long> itemModifiedList = new ArrayList<Long>();
			for(WaitingListDTO reservation : reservations) {
				if(reservation.getBookDTO()!=null) {
					itemModifiedList.add(reservation.getBookDTO().getId());
				}else {
					itemModifiedList.add(reservation.getMagazineDTO().getId());
				}
				
			}
			
			for(WaitingListDTO reservation : reservations) {
				waitingListToDelete.add(reservation.getId());
			}
			
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("reservationsObsolete", waitingListToDelete);
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("itemsToModify", itemModifiedList);
		}
		return RepeatStatus.FINISHED;
	}
}
