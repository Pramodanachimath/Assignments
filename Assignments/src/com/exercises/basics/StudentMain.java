package com.exercises.basics;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student();
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the marks");

		int[] marks = { 90, 90, 80, 90, 75, 80 };
		student.name = "Pramod";
		student.department = "Mech";
		student.printDetails();
		
		System.out.println(student.getGrades(marks));

	}
}
