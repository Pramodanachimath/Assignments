package com.exercises.basics;

public class Student {

	String name;
	String department;

	void printDetails() {
		System.out.println("name: " + name);
		System.out.println("department: " + department);
	}

	String getGrades(int[] marks) {
		String grade = null;
		int sum = 0;
		for (int val : marks) {

			sum += val;
		}
		int avg = sum / marks.length;

		if (avg > 90)
			grade = "A grade";

		if (avg > 80 && avg < 90)
			grade = "B grade";
		if (avg > 70 && avg < 80)
			grade = "C grade";
		if (avg > 40 && avg < 70)
			grade = "D grade";
		if (avg < 40)
			grade = "Fail";

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		return grade;

	}

}
