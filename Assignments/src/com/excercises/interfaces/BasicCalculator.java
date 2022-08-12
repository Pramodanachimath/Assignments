package com.excercises.interfaces;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
		int sum=x+y;
		System.out.println("sum : "+sum);

	}

	@Override
	public void product(int x, int y) {
	
		int product=x*y;
		System.out.println("product : "+product);
	}

}
