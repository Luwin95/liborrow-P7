package com.liborrow.callagainbatch.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobLauncherController {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job firstBatchJob;
	
	@Autowired
	Job callagainJob;
	
	@Autowired
	Job reservationJob;
	
	@Autowired
	Job remindJob;

	@RequestMapping("/launchjob")
	public String handle() throws Exception {

		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(firstBatchJob, jobParameters);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

		return "Done";
	}
	
	@RequestMapping("/callagainJob")
	public String handle1() throws Exception {

		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(callagainJob, jobParameters);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return "Done";
	}
	
	@RequestMapping("/reservationJob")
	public String handle2() throws Exception {

		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(reservationJob, jobParameters);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return "Done";
	}
	
	@RequestMapping("/remindJob")
	public String handle3() throws Exception {

		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(remindJob, jobParameters);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return "Done";
	}
}
