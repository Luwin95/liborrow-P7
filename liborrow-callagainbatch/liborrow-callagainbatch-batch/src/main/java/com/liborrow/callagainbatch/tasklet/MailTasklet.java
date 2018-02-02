package com.liborrow.callagainbatch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import com.liborrow.callagainbatch.AbstractJob;

public class MailTasklet extends AbstractJob implements Tasklet, InitializingBean{
	
	public void afterPropertiesSet() throws Exception {
		  
	}
	
	public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {
		getManagerFactory().getMailManager().sendMail();
		return RepeatStatus.FINISHED;
	}

}
