package com.exercises.Overriding;

public class Manager extends Emloyee{
	
	void calcBonus(int amount)
	{
		System.out.println("manager bonus "+(amount*2));
	}

}
