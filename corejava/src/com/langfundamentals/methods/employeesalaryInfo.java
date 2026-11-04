package com.langfundamentals.methods;

import java.util.Scanner;

public class employeesalaryInfo {
	Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("main method started");

		double bs = getBasic();
		double hra = getHouseRentAllowance();
		double lta = getLeaveTravelAssistance();
		double mc = getMealCoupons();
		double pf = getPF();
		double gt = getGratuity();

		System.out.println("Total Fixed Compensation : " + (bs + hra + lta + mc + pf + gt));

		System.out.println("main method ended");
	}

	double getBasic() {
		System.out.println("Enter basic salary : ");
		double basic = sc.nextDouble();
		return basic;
	}

	double getHouseRentAllowance() {
		System.out.println("Enter HRA : ");
		double hra = sc.nextDouble();
		return hra;
	}

	double getLeaveTravelAssistance() {
		System.out.println("Enter LTA : ");
		double lta = sc.nextDouble();
		return lta;
	}

	double getMealCoupons() {
		System.out.println("Enter meal amount : ");
		double MealCoupons = sc.nextDouble();
		return MealCoupons;
	}

	double getPF() {
		System.out.println("Enter PF amount : ");
		double pf = sc.nextDouble();
		return pf;
	}

	double getGratuity() {
		System.out.println("Enter Gratuity : ");
		double gratuity = sc.nextDouble();
		return gratuity;
	}

}
