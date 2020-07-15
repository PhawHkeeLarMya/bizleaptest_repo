package com.bizleap.candidate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bizleap.commons.domain.AbstractEntity;

@Entity
@Table(name = "position")
public class Position extends AbstractEntity {

	@Column(name = "positionId")
	private String positionId;

	@ManyToOne
	private Job job;

	public Position() {
	}

	public Position(String positionId, Job job) {
		this.positionId = positionId;
		this.job = job;
	}


	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Position id: ", positionId)
				.append("Job: ", job)
				.toString();
	}
}