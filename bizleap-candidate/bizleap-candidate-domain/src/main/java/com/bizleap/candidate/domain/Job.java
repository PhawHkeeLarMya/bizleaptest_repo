package com.bizleap.candidate.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bizleap.commons.domain.AbstractEntity;

@Entity
@Table(name = "job")
public class Job extends AbstractEntity {

	@Column (name = "jobId")
	private String jobId;
	
	@Column (name = "jobTitle")
	private String jobTitle;
	
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Position> positionList;

	public Job() {
	}

	public Job(String jobId, String jobTitle) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
	}
	
	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}
	
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.appendSuper(super.toString())
				.append("Job id: ", jobId)
				.append("Job title: ", jobTitle)
				.append("Position list: ", positionList)
				.toString();
	}
}