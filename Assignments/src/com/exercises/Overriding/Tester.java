package com.exercises.Overriding;

public class Tester extends Emloyee{

	@Override
	void calcBonus(int amount) {
		System.out.println("tester amount "+(amount/2));
	}

	
}
