package com.study.observer;

public class LoanRequest {
	private String stepName;
	private String applicationStatus;
	
	public LoanRequest(String stepName, String applicationStatus) {
		this.stepName = stepName;
		this.applicationStatus = applicationStatus;
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

}
