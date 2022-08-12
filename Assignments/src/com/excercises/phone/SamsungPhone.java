package com.excercises.phone;

public class SamsungPhone extends ButtenPhone implements ISmartPhone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
	}

	@Override
	public void takePhotos() {
		System.out.println("Samsung takes  good Photos ");

	}

	@Override
	public void showFeatures() {
		System.out.println("Samsung has features like --");
		System.out.println("Games");
		System.out.println("Internet speed");
		System.out.println("touch Screen");

	}

}
