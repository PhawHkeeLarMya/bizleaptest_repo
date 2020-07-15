package com.bizleap.candidate.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.bizleap.candidate.domain.JobVacancy;
import com.bizleap.candidate.service.dao.JobVacancyDao;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

@Repository
public class JobVacancyDaoImpl extends AbstractDaoImpl<JobVacancy, String> implements JobVacancyDao {

	protected JobVacancyDaoImpl() {
		super(JobVacancy.class);
	}
	
	public void save(JobVacancy jobVacancy) throws ServiceUnavailableException {
		saveOrUpdate(jobVacancy);
	}
}
