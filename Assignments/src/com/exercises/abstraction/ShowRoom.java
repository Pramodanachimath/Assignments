package com.exercises.abstraction;

public class ShowRoom {

	public static void main(String[] args) {

		Vehicle vehicle = new Bike("250CC", "KTM", 250000, "sportsBike");

		vehicle.getMailage();
		vehicle.printAccessories();
		vehicle.getDetails();
		System.out.println();

		Bike bike = (Bike) vehicle;
		bike.sportFeatures();
		vehicle = new Car("10000CC", "Lotus", 100000, "SuperCar");

		vehicle.getMailage();
		vehicle.printAccessories();
		vehicle.getDetails();
		System.out.println();
		Car car = (Car) vehicle;
		car.safetyFeatures();
	}

}
