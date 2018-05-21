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

public class GetReservationAvailableTasklet extends AbstractJob implements Tasklet, InitializingBean  {
	
	public void afterPropertiesSet() throws Exception {
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		Map<String, List<String>> emailAndReservation = new HashMap<String, List<String>>();
		List<WaitingListDTO> reservations = getManagerFactory().getReservationManager().getWaitingListAvailable();
		for(WaitingListDTO reservation: reservations) {
			if(emailAndReservation.containsKey(reservation.getBorrower().getEmail()))
			{
				List<String> borrowToSave = (List<String>) emailAndReservation.get(reservation.getBorrower().getEmail());
				if(null!= reservation.getBookDTO() && reservation.getBookDTO().getId()!=0)
				{
					borrowToSave.add(reservation.getBookDTO().getTitle());
				}else{
					borrowToSave.add(reservation.getMagazineDTO().getName()+" n° "+reservation.getMagazineDTO().getEditionNumber());
				}
				emailAndReservation.put(reservation.getBorrower().getEmail(), borrowToSave);
			}else {
				List<String> borrowToSave = new ArrayList<String>();
				if(null!= reservation.getBookDTO() && reservation.getBookDTO().getId()!=0)
				{
					borrowToSave.add(reservation.getBookDTO().getTitle());
				}else {
					borrowToSave.add(reservation.getMagazineDTO().getName()+" n° "+reservation.getMagazineDTO().getEditionNumber());
				}
				emailAndReservation.put(reservation.getBorrower().getEmail(), borrowToSave);
			}
		}
		if(emailAndReservation.size()>=1) {
			chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("emailAndReservation", emailAndReservation);
		}
		return RepeatStatus.FINISHED;
	}

}
