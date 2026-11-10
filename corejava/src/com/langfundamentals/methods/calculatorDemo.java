package com.langfundamentals.methods;

public class calculatorDemo {

	void main(String[] args) {

		System.out.println("main method started ");

		int s = addition();
		System.out.println("addition of two numbers : " + s);
		
		double mul = multiplication();
		System.out.println("multiplication of two numbers : " + mul);

		System.out.println("main method ended ");
	}
	
	
	double multiplication() {
		System.out.println("multiplication method called ");
		int a = 300;
		int b = 5;
		int product = a * b;
		return product;
	}

	int addition() {
		System.out.println("addition method called");
		int a = 100;
		int b = 200;
		int sum = a + b;
		return sum;

	}
}
