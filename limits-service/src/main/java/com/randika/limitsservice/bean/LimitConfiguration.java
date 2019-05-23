package com.randika.limitsservice.bean;

public class LimitConfiguration {
	private int maximum,minimum;

	// This might need when auto generating beans in some spring versions
	protected LimitConfiguration() {
		super();
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	
	
}
