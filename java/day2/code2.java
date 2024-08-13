package com.code1;

public class code2 {
	int b = 20;
	static int c = 30;

	public static void main(String[] args) {
		int a = 10;
		System.out.println("Local Variable : "+ a );
		
		code2 obj = new code2();
		System.out.println(obj.b);
		
		System.out.println(code2.c);

	}

}
