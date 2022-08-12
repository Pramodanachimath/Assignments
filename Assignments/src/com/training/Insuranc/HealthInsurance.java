package com.training.Insuranc;

public class HealthInsurance extends Insurance{

	public HealthInsurance(String name, int duration, String type) {
		super(name, duration, type);
	}

	

	void policyDetails()
	{
		System.out.println("Health insurance details");
		System.out.println("name "+name);
		System.out.println("duration "+duration);
		System.out.println("type "+type);
	}
}
