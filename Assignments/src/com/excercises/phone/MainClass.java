package com.excercises.phone;

public class MainClass {

	public static void main(String[] args) {

		IBasicPhone basic=new ButtenPhone();
		basic.call();
		basic.play();
		System.out.println();
		
		ISmartPhone smart=new SamsungPhone();
		smart.showFeatures();
		smart.takePhotos();
		System.out.println();
	    
		smart=new Iphone();
		smart.showFeatures();
		smart.takePhotos();
		
	}

}
