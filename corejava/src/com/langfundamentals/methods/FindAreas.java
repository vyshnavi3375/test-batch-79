package com.langfundamentals.methods;

import java.util.Scanner;

//with return type + with parameters
//wap to find a area of circle, triangle,square,rectangle.
//triangle = 0.5*base*height
//circle = pi* r*r
//square = s*s
//rectangle = length* breadth

public class FindAreas {

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base : ");
		double base = sc.nextDouble();

		System.out.println("Enter height : ");
		double height = sc.nextDouble();

		double arTriangle = FindAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is : " + arTriangle);
		
		System.out.println("Enter radius : ");
		double r = sc.nextDouble();
		double arCir = FindAreaOfCircle(r);
		System.out.println("Area Of Circle is : " + arCir);
		
	}

	double FindAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	double FindAreaOfTriangle(double b, double h) {
		double arTri = 0.5 * b * h;
		return arTri;
	}

}
