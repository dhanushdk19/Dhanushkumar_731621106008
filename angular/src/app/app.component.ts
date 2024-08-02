import { Component } from '@angular/core'; 
import { Employee } from '../Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee : Employee ;
  result : string;

  constructor(private service : EmployeeService){
    this.employee=new Employee();
    this.result="";
  }

  insertEmployee(data:any){
    this.employee.id = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    // alert(data.empId+" "+data.empName+" "+data.empSalary);
    
    // this.service.insertEmployee(this.employee);

    this.result = this.service.insertEmployee(this.employee);
  
  }
}
