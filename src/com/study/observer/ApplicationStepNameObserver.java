package com.study.observer;

public class ApplicationStepNameObserver implements Observer {

	private Subject subject;
	
	public ApplicationStepNameObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update(LoanRequest preLoan, LoanRequest newLoan) {
		if (!preLoan.getStepName().equals(newLoan.getStepName())) {
			System.out.println("Application step changed from " + preLoan.getStepName() + " to "
					+ newLoan.getStepName());
		}
	}

}
