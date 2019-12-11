package com.study.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class AppleUtil {

	public static List<Apple> filterApple(List<Apple> apples, ApplePredicate predicate) {
		List<Apple> response = new ArrayList<Apple>();
		apples.forEach(apple -> {
			if (predicate.test(apple)) {
				response.add(apple);
			}
		});
		return response;
	}
}
