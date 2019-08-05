package com.manpreet.microservices.limitsservice.domain;

public class LimitConfigration {

	private int minimum;

	protected LimitConfigration() {
	}

	public LimitConfigration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	private int maximum;

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}
}
