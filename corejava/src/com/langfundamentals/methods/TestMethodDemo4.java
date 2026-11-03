package com.langfundamentals.methods;

import java.util.Scanner;

//wap to get employee info
public class TestMethodDemo4 {

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your salary : ");
		double salary = sc.nextDouble();

		System.out.println("enter your age : ");
		int age = sc.nextInt();

		System.out.println("enter your name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("enter your Phone : ");
        long phone = sc.nextLong();
        
        System.out.println("enter your gender : ");
        char gen = sc.next().charAt(0);   //method chaining-calling a method but resulted value calls another method.
		
		
		getEmployeesalary(salary);
		employeeAgeInfo(age);
		employeeNameInfo(name);
		employeePhoneDetails(phone);
		employeeGenderInfo(gen);

		System.out.println("main method ended");
	}
	
	void employeeGenderInfo(char gen) {
		System.out.println("Gender Info : " +gen);
	}
	
	
	
	void employeePhoneDetails (long phone) {
		System.out.println("Employee phone is : " + phone);
	}
	

	void employeeNameInfo(String name) {
		System.out.println("Employee name is : " + name);
	}

	void employeeAgeInfo(int age) {
		System.out.println("Employee age is : " + age);
	}

	void getEmployeesalary(double salary) {
		System.out.println("the current salary is : " + salary);
	}

}
