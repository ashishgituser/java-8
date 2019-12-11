package com.study.observer;

public class ApplicationStatusObserver implements Observer {

	private Subject subject;

	public ApplicationStatusObserver(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(LoanRequest preLoan, LoanRequest newLoan) {
		if (!preLoan.getApplicationStatus().equals(newLoan.getApplicationStatus())) {
			System.out.println("Application status changed from " + preLoan.getApplicationStatus() + " to "
					+ newLoan.getApplicationStatus());
		}
	}

}
