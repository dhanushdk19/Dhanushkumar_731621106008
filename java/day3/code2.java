package com.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheelers extends Vehicle{
	void noOfWheels() {
		System.out.println("I hava two wheels");
	}
}

class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("Brrand name is Honda");
	}
}

class Scooty extends TwoWheelers{
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}

public class code2 {

	public static void main(String[] args) {
		Bikes bike = new Bikes();
		bike.brandName();
		bike.noOfEngine();
		bike.noOfWheels();
		
		Scooty sco = new Scooty();
		sco.brandName();
		sco.noOfWheels();
		sco.noOfEngine();

	}

}
