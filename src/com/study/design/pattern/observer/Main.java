package com.study.design.pattern.observer;

public class Main {

	public static void main(String[] args) {
		
		Subject subject = new ApplicationCompleteSubject();
		
		Observer ob1 = new ApplicationStepNameObserver(subject);
		Observer ob2 = new ApplicationStatusObserver(subject);
		
		subject.register(ob1);
		subject.register(ob2);
		
		subject.notifyObserver(new LoanRequest("KYC", "PENDING"), new LoanRequest("KYC", "INITIATE"));

	}

}
