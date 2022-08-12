package com.exercises.Overriding;

public class Developer extends Emloyee{

	@Override
	void calcBonus(int amount) {
		System.out.println("Developer bonus "+(amount*4));
	}

	
}
