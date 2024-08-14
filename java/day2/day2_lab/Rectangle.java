<<<<<<< HEAD
package com.day2_lab;

public class Rectangle {
	float width,height;
	
	float area,peri;
	
	
	void calc(float width,float height) {
		 area = width * height;
		 peri = 2*(width + height);
		
	}
	
	
	void display() {
		System.out.println("Area of Rectangle is : "+area);
		System.out.println("Perimeter of Rectangle is : "+peri);
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.calc(10,20);
		rec1.display();
		
		rec1.calc(20.5f, 10.8f);
		rec1.display();

	}

}
=======
package com.day2_lab;

public class Rectangle {
	float width,height;
	
	float area,peri;
	
	
	void calc(float width,float height) {
		 area = width * height;
		 peri = 2*(width + height);
		
	}
	
	
	void display() {
		System.out.println("Area of Rectangle is : "+area);
		System.out.println("Perimeter of Rectangle is : "+peri);
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.calc(10,20);
		rec1.display();
		
		rec1.calc(20.5f, 10.8f);
		rec1.display();

	}

}
>>>>>>> 121b23483dcee263b2a6c299d830c0cee766cbe8
