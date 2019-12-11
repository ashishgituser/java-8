package com.study.strategy;

public class AppleHeavyWeigthPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}

}
