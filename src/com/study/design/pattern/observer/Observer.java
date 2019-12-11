package com.study.design.pattern.observer;

public interface Observer {
	public void update(LoanRequest preLoan, LoanRequest newLoan);
}
