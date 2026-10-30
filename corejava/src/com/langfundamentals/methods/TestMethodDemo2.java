package com.langfundamentals.methods;

//printing calculated values for add sub mul div modulus by using arithmetic operators
//No return type + with parameters
public class TestMethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		// call by value
		// method are called by passing values or argumentys
		addition(100, 40);// sum
		subtraction(70, 24);// difference
		multiplication(234, 56);// product
		division(465, 2);// quotient
		modulus(465, 2);// remainder

		System.out.println("main method ended");
	}

	// a,b are parameters
	static void addition(int a, int b) {
		System.out.println("addition method called");
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called");
		System.out.println(a - b);

	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called");
		System.out.println(a * b);
	}

	static void division(int a, int b) {
		System.out.println("division method called");
		System.out.println(a / b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called");
		System.out.println(a % b);
	}

}
