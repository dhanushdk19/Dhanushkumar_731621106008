package com.code1;

public class code6 {
	code6(String name){
		System.out.println("Welcome "+name);
	}
	
	code6(int a,int b){
		System.out.println("Sum : "+(a+b));
	}
	
	code6(int n){
		System.out.println("Given Number is "+n);
	}

	public static void main(String[] args) {
		code6 obj1 = new code6("Dhanush");
		code6 obj2 = new code6(10,20);

		code6 obj3 = new code6(18);

		

	}

}
