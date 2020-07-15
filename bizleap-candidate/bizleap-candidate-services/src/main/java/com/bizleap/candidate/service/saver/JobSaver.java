package com.bizleap.candidate.service.saver;

import java.util.List;
import com.bizleap.candidate.domain.Job;


public interface JobSaver {

	public void save() throws Exception;
	public void setJobList(List<Job> jobList);
}
