package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;	//by name DI with autowired fectures.

	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
