package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
 EmployeeDao ed;
 	public EmployeeService() {
 		ed = new EmployeeDao();
 				
 	}
	public List<Employee> getAllEmployee() {
		//EmployeeDao ed = new EmployeeDao();
		return ed.getAllEmployee();
		
	}
	
	public String storeEmployeeDetails(Employee emp) {
		//EmployeeDao ed = new EmployeeDao();
		
		if(ed.storeEmployee(emp)>0)  {
			return "Record Stored Successfully";
		}else {
			return "Record didn't store";
		}
	}
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted Successfully";
		}else {
			return "Record not present";
		}
	}
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated Successfully";
		}else {
			return "Record not updated";
		}
}
	public List<Employee> findSalary(float salary){
		return ed.findBySalary(salary);
	}
}
