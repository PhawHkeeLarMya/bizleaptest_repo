package com.bizleap.candidate.service.saver.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bizleap.candidate.domain.Job;
import com.bizleap.candidate.service.saver.JobSaver;

public class JobSaverImpl implements JobSaver{
	
	@Autowired
	private JobService jobService;

	private JobServiceJdbc jobServiceJdbc;

	private List<Job> jobList;

	public JobSaverImpl() {
		if (jobServiceJdbc == null)
			jobServiceJdbc = new JobServiceJdbcImpl();
	}

	public List<Job> getJobList() {
		if (jobList == null)
			jobList = new ArrayList<Job>();
		return jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}
	
	@Override
	public void save() throws Exception {
		if (jobList != null) {
			for (Job job : jobList) {
				jobService.saveJob(job);
			}
		}
	}

}
