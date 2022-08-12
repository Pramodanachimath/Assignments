package com.excercises.phone;

public class Iphone extends ButtenPhone  implements ISmartPhone {

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
		System.out.println("Iphone takes Photos very clearly");

	}

	@Override
	public void showFeatures() {
		System.out.println("Iphone has features like --");
		System.out.println("Camera");
		System.out.println("Battery");
		System.out.println("touch Screen");

	}

}
