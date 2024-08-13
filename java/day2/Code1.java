package com.code1;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId , String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		
		
	}
	
	void display() {
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);
	}
}

public class Code1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"dhanush",2000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"kumar",4000);
		emp2.display();
		

	}

}
