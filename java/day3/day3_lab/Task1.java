package com.day3;

class Animal1{
	void makeSound() {
		System.out.println("Cat meows");
	}
}

class cat extends Animal1{
//	void makeSound() {
//		System.out.println("Bark");
//	}
}

public class Animal {

	public static void main(String[] args) {

		cat c = new cat();
		c.makeSound();
	}

}
