package com.day3;



class Area{
	
	void getArea(float a,float b) {
		float area = a*b;
		System.out.println("Area is : "+area);
	}
	
	void getArea(int a,int b) {
		int area = a*b;
		System.out.println("Area is  "+area);
	}
}

class RecTangle extends Area{
	void method() {
	System.out.println("It is a SubClass");
	}
}

public class Shape {
	public static void main(String[] args) {
		
		RecTangle rec = new RecTangle();
		rec.getArea(5,5);
		rec.getArea(5.5f,5.5f);

	}

}
