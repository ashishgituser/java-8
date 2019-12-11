package com.study.observer;

import java.util.ArrayList;
import java.util.List;

public class ApplicationCompleteSubject implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver(LoanRequest preLoan, LoanRequest newLoan) {
		this.observers.forEach(observer -> {
			observer.update(preLoan, newLoan);
		});
	}
}
