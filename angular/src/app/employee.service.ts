import { Injectable } from '@angular/core';
import { Employee } from '../Employee';
import { HttpClient } from '@angular/common/http';
import { subscribe } from 'node:diagnostics_channel';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url : string;

  constructor(private http:HttpClient) {
    this.url = "http://localhost:3004/employees";
   }

  insertEmployee(employee : Employee){
    this.http.post<Employee>(this.url,employee).subscribe();
    return"Employee Details Added";

  }
}
