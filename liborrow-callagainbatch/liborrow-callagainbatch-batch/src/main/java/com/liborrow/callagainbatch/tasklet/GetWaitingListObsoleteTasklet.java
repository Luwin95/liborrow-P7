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
import com.liborrow.webinterface.generated.model.WaitingListDTO;

public class GetWaitingListObsoleteTasklet extends AbstractJob implements Tasklet, InitializingBean  {
	
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		List <WaitingListDTO> reservations = new ArrayList<WaitingListDTO>();
		List<Long> waitingListToDelete =  new ArrayList<Long>();
		Map<Long, Long> positionAndItem = new HashMap<Long, Long>();
		reservations = getManagerFactory().getReservationManager().getWaitingListByNotificationDateObsolete();
		
		if(reservations.size()>=1)
		{
			for(WaitingListDTO reservation : reservations) {
				if(reservation.getBookDTO()!=null) {
					positionAndItem.put(reservation.getBookDTO().getId(),new Long(reservation.getPosition()));
				}else {
					positionAndItem.put(reservation.getMagazineDTO().getId(),new Long(reservation.getPosition()));
				}
			}
			for(WaitingListDTO reservation : reservations) {
				waitingListToDelete.add(reservation.getId());
			}
			
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("reservationsObsolete", waitingListToDelete);
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("itemsToModify", positionAndItem);
		}
		return RepeatStatus.FINISHED;
	}
}
