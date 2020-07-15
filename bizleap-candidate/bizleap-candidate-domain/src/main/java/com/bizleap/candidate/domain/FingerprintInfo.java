package com.bizleap.candidate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.xmlbeans.impl.piccolo.util.FactoryServiceFinder;

import com.bizleap.commons.domain.AbstractEntity;

@Entity
@Table(name = "fingerprintinfo")
public class FingerprintInfo extends AbstractEntity{

	@Column(name = "fingerprintdata1", length = 255)
	private String fingerprintData1;

	@Column(name = "fingerprintdata2", length = 255)
	private String fingerprintData2;

	@Column(name = "fingerprintlabel", length = 30)
	private String fingerprintLabel;

	@Column(name = "createddate", length = 80)
	private String createdDate;

	@ManyToOne
	private Candidate candidate;

	public FingerprintInfo() {
	}

	
	public FingerprintInfo(String fingerprintData1, String fingerprintData2, String fingerprintLabel,
			String createdDate) {
		this.fingerprintData1 = fingerprintData1;
		this.fingerprintData2 = fingerprintData2;
		this.fingerprintLabel = fingerprintLabel;
		this.createdDate = createdDate;
	}


	public String getFingerprintData1() {
		return fingerprintData1;
	}

	public void setFingerprintData1(String fingerprintData1) {
		this.fingerprintData1 = fingerprintData1;
	}

	public String getFingerprintData2() {
		return fingerprintData2;
	}

	public void setFingerprintData2(String fingerprintData2) {
		this.fingerprintData2 = fingerprintData2;
	}

	public String getFingerprintLabel() {
		return fingerprintLabel;
	}

	public void setFingerprintLabel(String fingerprintLabel) {
		this.fingerprintLabel = fingerprintLabel;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public Candidate getCandidate() {
		return candidate;
	}


	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("fingerprint data1: ", fingerprintData1)
				.append("fingerprint data2: ", fingerprintData2)
				.append("fingerprint label: ", fingerprintLabel)
				.append("created date: ", createdDate)
				.toString();
	}
}