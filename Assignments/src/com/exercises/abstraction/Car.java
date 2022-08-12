package com.exercises.abstraction;

public class Car extends Vehicle {

	public Car(String model, String brand, int price, String type) {
		super(model, brand, price, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMailage() {
		if (brand.equalsIgnoreCase("Lotus")) {
			System.out.println("Lotus has very high mailage");
		}
		else if (brand.equalsIgnoreCase("F1")) {
			System.out.println("F1 has very very high mailage");
		}
		else if (brand.equalsIgnoreCase("nono")) {
			System.out.println("nano has poor  mailage");
		}
		else if (brand.equalsIgnoreCase("Fortuner")) {
			System.out.println("Fortuner has good  mailage");
		} else {
			System.out.println("car has average mailage");
		}

	}

	@Override
	void printAccessories() {
		if (type.equalsIgnoreCase("sportsCar")) {
			System.out.println("Bike Accessories are :");
			System.out.println("Helmet");
			System.out.println("Jacket");
			System.out.println("Diesel");
			System.out.println("HorsePower");
			System.out.println("Suits");
		}
		else if (type.equalsIgnoreCase("supersCar")) {
			System.out.println("Car Accessories are :");
			System.out.println("Luxury Interior");
			System.out.println("Jacket");
			System.out.println("Sound");
			System.out.println("Conmfort");

		}
		else if (type.equalsIgnoreCase("normalCar")) {
			System.out.println("Car Accessories are :");
			System.out.println("Sound System");
			System.out.println("SeatBelt");
			System.out.println("More Space ");
		}
	}

	void safetyFeatures() {
		if (type.equalsIgnoreCase("sportsCar")) {
			System.out.println("Safety is very good");
		}
		else if (type.equalsIgnoreCase("superCar")) {
			System.out.println("Safety is very accellent");
		} else {
			System.out.println("Safety is  average");
		}

	}

}
