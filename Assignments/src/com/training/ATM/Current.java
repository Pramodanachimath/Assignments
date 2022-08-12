package com.training.ATM;

public class Current extends Bank{

	public Current(double balance) {
		super(balance);
		
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -=amount-100;
		System.out.println("withdraw : "+(amount));
	}

	@Override
	void deposite(double amount) {
		balance +=amount-100;
		System.out.println("deposite : "+(amount));
	}
  
}
