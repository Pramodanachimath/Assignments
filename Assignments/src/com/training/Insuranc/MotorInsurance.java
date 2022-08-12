package com.training.Insuranc;

public class MotorInsurance extends Insurance {

	
	public MotorInsurance(String name, int duration, String type) {
		super(name, duration, type);
		// TODO Auto-generated constructor stub
	}

	void policyDetails()
	{
		System.out.println("Motor insurance details");
		System.out.println("name "+name);
		System.out.println("duration "+duration);
		System.out.println("type "+type);
	}
}
