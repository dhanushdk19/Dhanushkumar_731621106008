import java.util.*;

public class MyClass{
  public static void main(String args[]){
    int employeeId;
    String employeeName;
    float employeeSalary;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Employee Id : ");
    employeeId = sc.nextInt();
    System.out.println("Enter Employee Name : ");
    employeeName = sc.next();
    System.out.println("Enter Employee salary : ");
    employeeSalary = sc.nextFloat();

    System.out.println("Employee Id : " + employeeId);
    System.out.println("Employee Name : " + employeeName);
    System.out.println("Employee Salary : " + employeeSalary);

  }
}