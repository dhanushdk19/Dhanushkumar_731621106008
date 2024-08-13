package com.code1;

public class code4 {
	String name;
	code4(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	
	code4(int a,int b){
		System.out.println("Addition : "+(a+b));
	}
	
	void greeting() {
		System.out.println("Welcome "+ name);
	}

	public static void main(String[] args) {
		code4 obj = new code4("Dhanush");
	}

}
