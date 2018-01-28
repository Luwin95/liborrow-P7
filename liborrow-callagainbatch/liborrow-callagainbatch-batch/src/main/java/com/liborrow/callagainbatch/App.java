package com.liborrow.callagainbatch;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
    	
    	JobRepository jobRepository
        = vApplicationContext.getBean("jobRepository", JobRepository.class);
    	
    	JobLauncher jobLauncher= vApplicationContext.getBean("jobLauncher", JobLauncher.class);
    	
    	Job job = vApplicationContext.getBean("firstBatchJob", Job.class);
        JobParameters jobParameters = new JobParametersBuilder().toJobParameters();


        try {
        	JobExecution jobExecution = jobLauncher.run(job, jobParameters);
            BatchStatus batchStatus = jobExecution.getStatus();
        }catch(Exception e)
        {
        	
        }
//    	JobParameters jobParameters = new JobParameters();
//    	try {
//    		jobRepository.createJobExecution("firstBatchJob", jobParameters);
//    	}catch(Exception e) {
//    		
//    	}
    }
}
