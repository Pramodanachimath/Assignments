package com.excercises.interfaces;

public class CalculateMain {

	public static void main(String[] args) {

		 Scientific scientific =new ScientificCalculator();
		 
		 scientific.cube(5);
		 scientific.square(10);
		 
		 BasicCalculator basic=(BasicCalculator) scientific;
		 basic.add(10, 20);
		 basic.product(5, 5);
		 
	}

}
