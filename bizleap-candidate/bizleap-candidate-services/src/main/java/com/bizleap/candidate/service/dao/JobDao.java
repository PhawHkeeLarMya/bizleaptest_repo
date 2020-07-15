package com.bizleap.candidate.service.dao;

import java.util.List;

import com.bizleap.candidate.domain.Job;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

public interface JobDao extends AbstractDao<Job, String> {

	public List<Job> getAll(String string);
	public void save(Job job) throws ServiceUnavailableException;
}