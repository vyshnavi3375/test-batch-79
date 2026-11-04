package com.langfundamentals.methods;

import java.util.Scanner;

//WAP to print account related information in a bank-withdraw, deposit, check balance
public class BankAccount {

	double balance = 100000.00;

	void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube Bank");
		Scanner sc =  new Scanner(System.in);

		

		System.out.println("enter the amount to deposit : ");
		double amt = sc.nextDouble();
		deposit(amt);
		
		
		System.out.println("enter the amount to withdraw : ");
		double wamt = sc.nextDouble();
		withdraw(wamt);
		

		System.out.println("main method ended");
	}

	void deposit(double amount) {
		System.out.println("you entered the amount is : " + amount);
		balance = balance + amount;
		checkBalance();
	}

	void withdraw(double amount) {
		System.out.println("you entered amount is : " + amount);
	
			if (amount <= balance) {
				balance = balance - amount;
		}else {
			System.out.println("there is no proper sufficient amount");
		}
		checkBalance();

	}

	void checkBalance() {
		System.out.println("the current balance is : " + balance);

	}
}
