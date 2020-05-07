package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	List<Employee> findByEmpNo(String empNo);
	
	void deletebyEmpNo(String empNo);
	
	Employee updEmployee(Employee emp);

}
