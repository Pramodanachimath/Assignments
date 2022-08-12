package com.training.Insuranc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insurance insurance = new MotorInsurance("Acko", 5, "Bike");

		insurance.policyDetails();
		System.out.println();

		insurance = new HealthInsurance("XYZ", 10, "Family");

		insurance.policyDetails();

	}

}
