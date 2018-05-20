package com.liborrow.callagainbatch.tasklet;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;
import com.liborrow.webinterface.utils.enums.MailTypeEnum;

public class NotifyReservationAvailableTasklet extends AbstractJob implements Tasklet, InitializingBean {

	public void afterPropertiesSet() throws Exception {
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		Map<String, List<String>> emailAndReservations = (Map<String, List<String>>) chunkContext.getStepContext().getJobExecutionContext().get("emailAndReservations");
		Set keys = emailAndReservations.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String email = (String) it.next();
			List<String> reservations = (List<String>) emailAndReservations.get(email);
			getManagerFactory().getMailManager().createAndSendMail(email, reservations, MailTypeEnum.MAIL_RESERVATION_AVAILABLE);
		}
		return RepeatStatus.FINISHED;
	}
}
