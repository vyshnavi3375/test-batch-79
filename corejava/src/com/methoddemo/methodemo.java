package com.methoddemo;

public class methodemo {

		

	static void method1() {
		System.out.println("static method1");
		}
	//static method 2
		static void method2() {
		System.out.println("static method2");
		}
		
		//static method 3
		static void method3() {
			System.out.println("static method3");
			}
		//instance method 1
		void method4() {
			System.out.println("instance method1");
			}
		//instance method 2
				void method5() {
					System.out.println("instance method2");
					}
	

	public static void main(String[] args) {
		//calling static methods,static methods can be called directly
		method1();
		method2();
		method3();
//		
//		//calling instance method
//		//before calling instance method we should create object
		methodemo obj = new methodemo();
		obj.method4();
		obj.method5();
		
		
		

	}

}
