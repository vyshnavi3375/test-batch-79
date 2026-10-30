package com.langfundamentals.methods;
//no return type + no parameters
public class TestMethodDemo1 {
	
	//static method
	public static void welcome() {
		System.out.println("welcome to java world");
		 System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		 System.out.println("main method started ");
		 System.out.println(Thread.currentThread());
		 
		 TestMethodDemo1 t1 = new TestMethodDemo1();
		
		 //method calling
		 //static method can be called directly using method name
		 welcome();
		 //static method can aslo called by class name
		 TestMethodDemo1.welcome();	
		 
		 t1.hello();
		 
		 
		 System.out.println("main method ended ");
	}
	//instance method
	public void hello() {
		 System.out.println("hello good morning ");
		 System.out.println(Thread.currentThread());	
	}

}


