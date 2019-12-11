package com.study.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Apple> data = new ArrayList<Apple>();
		
		data.add(new Apple("green", 100));
		data.add(new Apple("yellow", 120));
		data.add(new Apple("green", 160));

		List<Apple> greenApples = AppleUtil.filterApple(data, new AppleGreenColorPredicate());
		System.out.println(greenApples.toString());
		
		List<Apple> heavyApples = AppleUtil.filterApple(data, new AppleHeavyWeigthPredicate());
		System.out.println(heavyApples.toString());
	}

}
