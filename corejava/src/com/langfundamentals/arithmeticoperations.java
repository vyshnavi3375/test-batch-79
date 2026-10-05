package com.langfundamentals;

public class arithmeticoperations {


  
	int add() {
		int a = 10;
		int b = 2;
		int sum = a+b;
		return sum;
	}
	int sub() {
		int a = 5;
		int b = 3;
		int sub = a-b;
		return sub;
	}

     int mul() {
    	 int a = 2;
    	 int b = 2;
    	 int mul = a*b;
    	 return mul;
    	 
     }
     int div(){
    	 int a = 4;
    	 int b = 2;
    	 int div = a / b;
    	 return div;
    	 
     }
     public static void main(String[] args) {
    	 arithmeticoperations s = new arithmeticoperations();
    	 System.out.println(s.add());
    	 System.out.println(s.sub());
    	 System.out.println(s.mul());
    	 System.out.println(s.div());
    	 
    	 
    	 
    	 
     }
}
