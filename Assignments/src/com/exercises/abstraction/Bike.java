package com.exercises.abstraction;

public class Bike extends Vehicle {

	public Bike(String model, String brand, int price, String type) {
		super(model, brand, price, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMailage() {
		if(brand.equalsIgnoreCase("KTM"))
		{
			System.out.println("KTM has good mailage");
		}
		else if(brand.equalsIgnoreCase("HorleyDavidSon"))
		 {
			 System.out.println("HorleyDavidSon has very good mailage");
		 }
		 else if(brand.equalsIgnoreCase("Pulsor"))
		 {
			 System.out.println("pulsor has average  mailage");
		 }
		 else if(brand.equalsIgnoreCase("Hero"))
		 {
			 System.out.println("pulsor has accellent  mailage");
		 }
		 else
		 {
			 System.out.println("UnKnown bike");
		 }


	}

	@Override
	void printAccessories() {
		
	if(type.equalsIgnoreCase("sportsBike"))
		{
		   System.out.println("Bike Accessories are :");
		   System.out.println("Helmet");
		   System.out.println("Jacket");
		   System.out.println("petrol");
		   System.out.println("Camera");
		   System.out.println("BikeSuits");
		}
		else if(type.equalsIgnoreCase("supersBike"))
		{
		   System.out.println("Bike Accessories are :");
		   System.out.println("Helmet");
		   System.out.println("Jacket");
		   System.out.println("Sound");
		   System.out.println("Camera");
		   System.out.println("BikeSuits");
		}
		else if(type.equalsIgnoreCase("normalBike"))
		{
		   System.out.println("Bike Accessories are :");
		   System.out.println("Helmet");
	       System.out.println("Seat");
	       System.out.println("High Weightage");
		}
	}
	void sportFeatures() {
		if(type.equalsIgnoreCase("sportsBike"))
		{
		   System.out.println("its a SportsBike");
		}
		else if(type.equalsIgnoreCase("supersBike"))
		{
		   System.out.println("its a SuperBike");
		}
		else
		{
			System.out.println("its a normal Bike");
		}
	}

}
