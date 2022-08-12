package com.excercises.phone;

public class ButtenPhone implements IBasicPhone {

	@Override
	public void call() {
		
		System.out.println("calling executed");
	}

	@Override
	public void play() {
		System.out.println("Playing executed");

	}

}
