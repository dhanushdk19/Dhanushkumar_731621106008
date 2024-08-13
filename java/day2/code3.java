package com.code1;

public class code3 {
	void myMethod() {
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		code3 obj = new code3();
		obj.myMethod();
		
		code3.myMethod2();
	}

}
