package com.code1;
//method overloading

public class code5 {
	void myMethod(String name) {
		System.out.println("Hi "+name);
	}
	
	void myMethod(int a,int b) {
		System.out.println("Multiply of a & b is : "+ a*b);
		
	}
	
	void myMethod(int n) {
		System.out.println("My age is "+n);
		
	}

	public static void main(String[] args) {
		code5 obj = new code5();
		obj.myMethod(18);
		obj.myMethod("Dhanush");
		obj.myMethod(5, 5);
	}

}
