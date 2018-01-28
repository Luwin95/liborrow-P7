package com.liborrow.callagainbatch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

public class TestTasklet implements Tasklet, InitializingBean {

	  public void afterPropertiesSet() throws Exception {
		  
	  }

	  public RepeatStatus execute(StepContribution contribution,
	               ChunkContext chunkContext) throws Exception {
		System.out.println("Hello world");
		return RepeatStatus.FINISHED;
	  }
	
}
