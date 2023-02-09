package com.example22.demo22.service;

import java.util.List;

import com.example22.demo22.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	void getAllEmployees();
	void getEmployeeById(String empid);
}
