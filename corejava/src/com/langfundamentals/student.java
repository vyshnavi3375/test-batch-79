package com.langfundamentals;

public class student {
	
	Integer id = 65;
	Integer marks = 100;
	Boolean passstatus = true;
	double a = 80.5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s = new student();
		int i=s.id; //autounboxing
		double a=s.a;//autoboxing
		System.out.println(s.id);
		System.out.println(s.marks);
		System.out.println(s.passstatus);
		
		
	}

}
