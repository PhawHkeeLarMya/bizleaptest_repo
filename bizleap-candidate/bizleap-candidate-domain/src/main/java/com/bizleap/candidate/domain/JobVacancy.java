package com.bizleap.candidate.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bizleap.commons.domain.AbstractEntity;

@Entity
@Table(name = "jobvacancy")
public class JobVacancy extends AbstractEntity {

	@OneToOne(cascade = CascadeType.ALL)
	private Job job;

	@Column(name = "positionCount")
	private int positionCount;

	@Column(name = "salary", length = 50)
	private String salary;

	@Column(name = "startDate")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name = "endDate")
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@OneToMany(mappedBy = "jobVacancy", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Candidate> candidateList;

	public JobVacancy() {
	}

	public JobVacancy(Job job, int positionCount, String salary, Date startDate, Date endDate) {
		this.job = job;
		this.positionCount = positionCount;
		this.salary = salary;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public List<Candidate> getCandidateList() {
		return candidateList;
	}

	public void setCandidateList(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public int getPositionCount() {
		return positionCount;
	}

	public void setPositionCount(int positionCount) {
		this.positionCount = positionCount;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("candidate list: ", candidateList)
				.append("Position count: ", positionCount)
				.append("Salary: ", salary)
				.append("Startd date: ", startDate)
				.append("End date: ", endDate).toString();
	}
}
