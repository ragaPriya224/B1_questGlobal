package com.example22.demo22;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example22.demo22.model.Employee;
import com.example22.demo22.service.EmployeeService;

@SpringBootApplication
public class Demo3Application {



	@Autowired
	EmployeeService employeeService;


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);


		Employee emp= new Employee();
		emp.setEmpId("emp6");
		emp.setEmpName("emp6");

		Employee emp1= new Employee();
		emp1.setEmpId("emp3");
		emp1.setEmpName("emp3");

		Employee emp2= new Employee();
		emp2.setEmpId("emp4");
		emp2.setEmpName("empnameis4");


		employeeService.insertEmployee(emp);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employeeService.insertEmployees(employees);

		employeeService.getAllEmployees();

		employeeService.getEmployeeById(emp1.getEmpId());

	}
}