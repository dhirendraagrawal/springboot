package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByEmpNo(String empNo) {
		return employeeRepository.findByEmpNo(empNo);
	}
	
	public void deletebyEmpNo(String empNo) {
		employeeRepository.deleteById(empNo);
	}

	@Override
	public Employee updEmployee(Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}
	
}
