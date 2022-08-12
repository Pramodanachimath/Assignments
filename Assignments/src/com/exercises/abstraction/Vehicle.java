package com.exercises.abstraction;

public abstract class Vehicle {
	String model;
	String brand;
	int price;
	String type;

	public Vehicle(String model, String brand, int price, String type) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}

	abstract void getMailage();

	abstract void printAccessories();

	void getDetails() {
		System.out.println("model: "+model);
		System.out.println("brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("type: "+type);
	}
}
