package com.training.ATM;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to ATM machine");
		System.out.println("Select the bank type");
		System.out.println("1. Savings \n2.Current");
//		System.out.println("2. Current");
		Bank bank = new Savings(25000);
		while (true) {
			
			int type = sc.nextInt();
			switch (type) {
			case 1:

				System.out.println("select the options");
				System.out.println("1. withdraw");
				System.out.println("2. deposite");
				System.out.println("3. getBalance");
				System.out.println("4. exit");

				
				while (true) {
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
//						double balance = 25000;
						System.out.println("Enter the amount to withdraw");
						double withdraw = sc.nextDouble();
						bank.withdraw(withdraw);
						double balance=25000;
						if (balance >= withdraw) {
							System.out.println("Withdraw Successfull");
							System.out.println("Please Collect your Cash");
							break;
						} else {
							System.out.println("Insuffucient balance");
						}
						break;
					case 2:
						System.out.println("Enter the amount to deposite");
						double deposite = sc.nextDouble();

						bank.deposite(deposite);

						System.out.println("Deposite Successfull");
						break;

					case 3:
						bank.getBalance();
						System.out.println("CURRENT BALANCE IS " + bank.getBalance());
						break;
					case 4:
						System.out.println("Exited successfully");
						System.exit(0);
						break;
					}
					
				}
             case 2:
				bank = new Current(10000);

				while (true) {
					System.out.println("select the options");
					System.out.println("1. withdraw");
					System.out.println("2. deposite");
					System.out.println("3. getBalance");
					System.out.println("4. exit");

					int choice1 = sc.nextInt();
					switch (choice1) {
					case 1:
						
						System.out.println("Enter the amount to withdraw");
						double withdraw = sc.nextDouble();
						bank.withdraw(withdraw);
						double balance=10000;
						if (balance >= withdraw) {
							System.out.println("Withdraw Successfull");
							System.out.println("Please Collect your Cash");
							System.out.println();
						} else {
							System.out.println("Insuffucient balance");
						}
						break;
					case 2:
						System.out.println("Enter the amount to deposite");
						double deposite = sc.nextDouble();
						bank.deposite(deposite);

						System.out.println("Deposite Successfull");
						System.out.println();
						break;

					case 3:
						System.out.println("CURRENT BALANCE IS " + bank.getBalance());
						break;
					case 4:
						
						System.out.println("Exited successfully");
						System.exit(0);
						break;
					}
				}

			}

		}

	}

}
