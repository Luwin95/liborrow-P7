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
import com.liborrow.webinterface.generated.model.BorrowDTO;
import com.liborrow.webinterface.utils.enums.MailTypeEnum;

public class RemindBorrowsTasklet extends AbstractJob implements Tasklet, InitializingBean {
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		Map<String, BorrowDTO> emailAndBorrows = (Map<String, BorrowDTO>) chunkContext.getStepContext().getJobExecutionContext().get("emailAndBorrows");
		Set keys = emailAndBorrows.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String email = (String) it.next();
			List<String> borrows = (List<String>) emailAndBorrows.get(email);
			getManagerFactory().getMailManager().createAndSendMail(email, borrows, MailTypeEnum.MAIL_LATE_BORROW);
		}
		return RepeatStatus.FINISHED;
	}
}
