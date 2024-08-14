package com.day3;

class C{
	C(){
		System.out.println("C");
	}
	
	C(int a){
		System.out.println("C 1");
	}
}

class D extends C{
	D(){
		super(5);
		System.out.println("D");
	}
	
	D(int a){
		System.out.println("D1");
	}
}

public class Invocation {

	public static void main(String[] args) {
		D d = new D(5);
	}

}
