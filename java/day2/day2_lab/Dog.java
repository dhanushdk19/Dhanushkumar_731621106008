package com.day2_lab;

public class Dog {
	String name,breed;
	
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	
	void update(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	
	void display() {
		System.out.println("Dog Name is "+name +" and its Breed is "+breed);;
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("Rocky","VillageDog");
		
		dog1.update("Ramu", "Labrador");
		
		dog1.display();

	}

}
