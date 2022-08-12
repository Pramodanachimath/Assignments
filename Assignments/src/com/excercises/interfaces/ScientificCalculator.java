package com.excercises.interfaces;

public class ScientificCalculator extends BasicCalculator implements Scientific {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		super.add(x, y);
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		super.product(x, y);
	}

	@Override
	public void square(int x) {
	
		int square=(x*x);
	    System.out.println("square : "+square);
	}

	@Override
	public void cube(int x) {
		int cube=(x*x*x);
	    System.out.println("cube : "+cube);

	}

}
