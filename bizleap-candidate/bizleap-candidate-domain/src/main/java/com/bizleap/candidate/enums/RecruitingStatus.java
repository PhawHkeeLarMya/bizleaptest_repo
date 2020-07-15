package com.bizleap.candidate.enums;

public enum RecruitingStatus {

	OPEN("Open"), ACCEPTED("Accepted"), INTERVIEWED("Interviewed"), SELECTED("Selected"), WAITING("Waiting");
	
	private String recruitingStatus;

	private RecruitingStatus(String recruitingStatus) {
		this.recruitingStatus = recruitingStatus;
	}

	public String getRecruitingStatus() {
		return recruitingStatus;
	}
}
