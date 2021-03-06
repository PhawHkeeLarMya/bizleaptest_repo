package com.bizleap.candidate.service.saver.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bizleap.candidate.domain.Job;
import com.bizleap.candidate.domain.JobVacancy;
import com.bizleap.candidate.service.saver.JobVacancySaver;

public class JobVacancySaverImpl implements JobVacancySaver{

	@Autowired
	private JobVacancyService jobVacancyService;

	private JobVacancyServiceJdbc jobVacancyServiceJdbc;

	private List<JobVacancy> jobVacancyList;

	public JobVacancySaverImpl() {
		if (jobVacancyServiceJdbc == null)
			jobVacancyServiceJdbc = new JobVacancyServiceJdbcImpl();
	}

	public List<JobVacancy> getJobVacancyList() {
		if (jobVacancyList == null)
			jobVacancyList = new ArrayList<JobVacancy>();
		return jobVacancyList;
	}

	public void setJobVacancyList(List<JobVacancy> jobVacancyList) {
		this.jobVacancyList = jobVacancyList;
	}
	
	@Override
	public void save() throws Exception {
		if (jobVacancyList != null) {
			for (JobVacancy jobVacancy : jobVacancyList) {
				jobVacancyService.saveJob(jobVacancy);
			}
		}
	}
}
