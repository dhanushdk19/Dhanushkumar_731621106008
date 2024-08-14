<<<<<<< HEAD
package com.day2_lab;

public class Circle {
	float radius;
	
	
	Circle(float radius){
		float area = (float) (Math.PI*(radius*radius));
		float peri = (float) (2*Math.PI*radius);
		
		System.out.println("Area of circle is : "+area);
		System.out.println("Circumference of circle is : "+peri);
		
	}

	public static void main(String[] args) {
		
		Circle cir1 = new Circle(5);
		Circle cir2 = new Circle(10.3f);
		

	}

}
=======
package com.day2_lab;

public class Circle {
	float radius;
	
	
	Circle(float radius){
		float area = (float) (Math.PI*(radius*radius));
		float peri = (float) (2*Math.PI*radius);
		
		System.out.println("Area of circle is : "+area);
		System.out.println("Circumference of circle is : "+peri);
		
	}

	public static void main(String[] args) {
		
		Circle cir1 = new Circle(5);
		Circle cir2 = new Circle(10.3f);
		

	}

}
>>>>>>> 121b23483dcee263b2a6c299d830c0cee766cbe8
