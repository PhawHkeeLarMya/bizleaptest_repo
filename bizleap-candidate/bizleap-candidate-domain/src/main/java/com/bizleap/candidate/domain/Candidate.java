package com.bizleap.candidate.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bizleap.candidate.enums.RecruitingStatus;
import com.bizleap.commons.domain.Person;
import com.bizleap.commons.domain.enums.hr.MatrimonialStatus;

@Entity
@Table(name = "candidate")
public class Candidate extends Person {

	@Column(name = "dateOfBirth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(name = "fatherName", length = 60)
	private String fatherName;

	@Column(name = "nrc", length = 30)
	private String nrc;

	@Column(name = "phone", length = 30)
	private String phone;

	@Column(name = "nationality", length = 20)
	private String nationality;

	@Column(name = "race", length = 50)
	private String race;

	@Column(name = "matrimonialStatus")
	@Enumerated(EnumType.STRING)
	private MatrimonialStatus matrimonialStatus;

	@Column(name = "recuritingStatus")
	@Enumerated(EnumType.STRING)
	private RecruitingStatus recuritingStatus;

	@Column(name = "educational", length = 80)
	private String educational;

	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Qualification> qualificationList;

	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<WorkExperience> workExperienceList;

	@Column(name = "expectedSalary", length = 50)
	private String expectedSalary;

	@Column(name = "photoFileName", length = 50)
	private String photoFileName;

	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FingerprintInfo> fingerprintInfoList;

	@ManyToOne
	private JobVacancy jobVacancy;

	public Candidate() {
	}

	
	public Candidate(Date dateOfBirth, String fatherName, String nrc, String phone, String nationality, String race,
			MatrimonialStatus matrimonialStatus, RecruitingStatus recuritingStatus, String educational,
			String expectedSalary, String photoFileName) {
		this.dateOfBirth = dateOfBirth;
		this.fatherName = fatherName;
		this.nrc = nrc;
		this.phone = phone;
		this.nationality = nationality;
		this.race = race;
		this.matrimonialStatus = matrimonialStatus;
		this.recuritingStatus = recuritingStatus;
		this.educational = educational;
		this.expectedSalary = expectedSalary;
		this.photoFileName = photoFileName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public MatrimonialStatus getMatrimonialStatus() {
		return matrimonialStatus;
	}

	public void setMatrimonialStatus(MatrimonialStatus matrimonialStatus) {
		this.matrimonialStatus = matrimonialStatus;
	}

	public RecruitingStatus getRecuritingStatus() {
		return recuritingStatus;
	}

	public void setRecuritingStatus(RecruitingStatus recuritingStatus) {
		this.recuritingStatus = recuritingStatus;
	}

	public String getEducational() {
		return educational;
	}

	public void setEducational(String educational) {
		this.educational = educational;
	}

	public List<Qualification> getQualificationList() {
		return qualificationList;
	}

	public void setQualificationList(List<Qualification> qualificationList) {
		this.qualificationList = qualificationList;
	}

	public List<WorkExperience> getWorkExperienceList() {
		return workExperienceList;
	}

	public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
		this.workExperienceList = workExperienceList;
	}

	public String getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public List<FingerprintInfo> getFingerprintInfoList() {
		return fingerprintInfoList;
	}

	public void setFingerprintInfoList(List<FingerprintInfo> fingerprintInfoList) {
		this.fingerprintInfoList = fingerprintInfoList;
	}

	public JobVacancy getJobVacancy() {
		return jobVacancy;
	}

	public void setJobVacancy(JobVacancy jobVacancy) {
		this.jobVacancy = jobVacancy;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.appendSuper(super.toString())
				.append("Date of birth: ", dateOfBirth)
				.append("Father name: ", fatherName)
				.append("NRC: ", nrc)
				.append("Phone: ", phone)
				.append("Nationality: ", nationality)
				.append("Race: ", race)
				.append("Matrimonial status: ", matrimonialStatus)
				.append("Recuriting status: ", recuritingStatus)
				.append("Educational: ", educational)
				.append("Qualification list: ", qualificationList)
				.append("Expected salary: ", expectedSalary)
				.append("Photo file name: ", photoFileName)
				.append("Fingerprint info list: ", fingerprintInfoList)
				.toString();
	}
}