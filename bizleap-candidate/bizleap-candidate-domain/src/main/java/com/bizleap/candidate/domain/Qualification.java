package com.bizleap.candidate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bizleap.commons.domain.AbstractEntity;

@Entity
@Table(name = "qualification")
public class Qualification extends AbstractEntity {

	@Column(name = "name", length = 255)
	private String name;

	@Column(name = "qualifiedDate")
	@Temporal(TemporalType.DATE)
	private Date qualifiedDate;

	@Column(name = "from", length = 255)
	private String from;

	@ManyToOne
	Candidate candidate;

	public Qualification() {
	}
	
	public Qualification(String name, Date qualifiedDate, String from, Candidate candidate) {
		this.name = name;
		this.qualifiedDate = qualifiedDate;
		this.from = from;
		this.candidate = candidate;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getQualifiedDate() {
		return qualifiedDate;
	}

	public void setQualifiedDate(Date qualifiedDate) {
		this.qualifiedDate = qualifiedDate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Name: ", name)
				.append("Qualilfied date: ", qualifiedDate)
				.append("From: ", from)
				.append("Candidate: ", candidate)
				.toString();
	}
}