package com.study.observer;

public interface Subject {
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver(LoanRequest preLoan, LoanRequest newLoan);
}
