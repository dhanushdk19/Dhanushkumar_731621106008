package com.day3;

class Employee1{
	void work() {
		System.out.println("Communication Enginner");
	}
	
	void getSalary() {
		System.out.println("5 Lakh per Annum");
	}
}

class HRManager extends Employee1{
	void addEmployee() {
		System.out.println("New Employee is added");
	}
}

public class Emp {

	public static void main(String[] args) {
		
		HRManager hr = new HRManager();
		
		hr.work();
		hr.getSalary();
		hr.addEmployee();
		

	}

}
