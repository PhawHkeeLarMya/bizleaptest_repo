package com.bizleap.candidate.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.bizleap.candidate.domain.Job;
import com.bizleap.candidate.service.dao.JobDao;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

@Repository
public class JobDaoImpl extends AbstractDaoImpl<Job, String> implements JobDao {

	protected JobDaoImpl() {
		super(Job.class);
	}
	
	public void save(Job job) throws ServiceUnavailableException {
		saveOrUpdate(job);
	}
}
