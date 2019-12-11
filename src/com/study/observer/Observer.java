package com.study.observer;

public interface Observer {
	public void update(LoanRequest preLoan, LoanRequest newLoan);
}
