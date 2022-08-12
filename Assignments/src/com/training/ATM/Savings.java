package com.training.ATM;

public class Savings extends Bank{

	
	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -=amount;
		System.out.println("withdrawn : "+(amount));
	}

	@Override
	void deposite(double amount) {
		balance +=amount;
		
		System.out.println("deposite : "+(amount));
	}
	
	
   
}
