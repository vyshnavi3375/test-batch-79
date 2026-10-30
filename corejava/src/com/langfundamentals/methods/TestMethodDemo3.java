package com.langfundamentals.methods;

//wap to print student info
//no return type + with parameters
public class TestMethodDemo3 {

	void main(String[] args) {
		System.out.println("main method started");

		getStudentAge(22);
		getStudentName("vyshnavi", "yerukala");
		getStudentheight(5.9);
		getStudentweight(60);

		System.out.println("main method ended");
	}

	void getStudentweight(double weight) {
		System.out.println("student weight is : " + weight);
	}

	void getStudentheight(double height) {
		System.out.println("student height is : " + height);

	}

	void getStudentAge(int age) {
		System.out.println("Student age is : " + age);

	}

	void getStudentName(String fname, String lname) {
		System.out.println("full name of the student is : " + fname + " " + lname);
	}

}
