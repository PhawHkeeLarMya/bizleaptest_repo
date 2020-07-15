package com.bizleap.candidate.service.saver;

import java.util.List;
import com.bizleap.candidate.domain.JobVacancy;

public interface JobVacancySaver {

	public void save() throws Exception;
	public void setJobVacancyList(List<JobVacancy> jobVacancyList);
}
