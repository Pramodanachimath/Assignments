package com.exercises.Overriding;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emloyee employee=new Manager();
		
		employee.calcBonus(500);
		
		employee=new Developer();
		employee.calcBonus(500);
		
		employee=new Tester();
		employee.calcBonus(500);
	}

}
