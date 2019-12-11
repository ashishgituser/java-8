package com.study.design.pattern.strategy;

public class Apple {
	private String color;
	private int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return this.getColor() + " : " + this.getWeight();
	}

}
