package com.excercises.assignment;

public class LamdaMain {

	public static void main(String[] args) {

		ICasio casio = (int x, int y) -> {

			System.out.println("sum : " + (x + y));
		};
		casio.calculator(10, 20);

		casio = (int x, int y) -> {

			System.out.println("product : " + (x * y));
		};
		casio.calculator(2, 20);

		casio = (int x, int y) -> {

			System.out.println("division : " + (x / y));
		};
		casio.calculator(10, 5);

		casio = (int x, int y) -> {

			System.out.println("substraction : " + (x - y));
		};
		casio.calculator(50, 20);
	}
}
