package com.bizleap.candidate.service.dao;

import java.util.List;

import com.bizleap.candidate.domain.JobVacancy;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

public interface JobVacancyDao extends AbstractDao<JobVacancy, String> {

	public List<JobVacancy> getAll(String string);
	public void save(JobVacancy jobVacany) throws ServiceUnavailableException;
}
