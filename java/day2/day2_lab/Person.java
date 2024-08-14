<<<<<<< HEAD
package com.day2_lab;

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		Person obj1 = new Person("dhanush",20);
		Person obj2 = new Person("kumar",18);		
		obj1.display();
		obj2.display();

	}

}
=======
package com.day2_lab;

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		Person obj1 = new Person("dhanush",20);
		Person obj2 = new Person("kumar",18);		
		obj1.display();
		obj2.display();

	}

}
>>>>>>> 121b23483dcee263b2a6c299d830c0cee766cbe8
