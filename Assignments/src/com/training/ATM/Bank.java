package com.training.ATM;

public class Bank {

	
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		balance -=amount;
	}
	void deposite(double amount) {
		balance +=amount;
	}
	double getBalance() {
		return balance;
	}
}
