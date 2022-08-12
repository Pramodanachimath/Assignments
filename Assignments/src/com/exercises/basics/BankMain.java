package com.exercises.basics;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account=new Account(25000);
		
		System.out.println("Before Withdraw "+ account.getBalance());
		account.deposit(5000);
		System.out.println("After deposite "+ account.getBalance());
		account.withdraw(2000);
		
		account.getBalance();
	
		System.out.println("After Withdraw "+ account.getBalance());
		System.out.println();
		
		
		Savings  saving=new Savings(1000);
		System.out.println("Before Withdraw "+ saving.getBalance());
		saving.withdraw(500);
		System.out.println("After Withdraw "+ saving.getBalance());
		saving.deposit(5000);
		System.out.println("After Deposite "+ saving.getBalance());
		saving.getBalance();
		System.out.println("savings "+saving.getBalance());
		saving.showplans();
	}

}
