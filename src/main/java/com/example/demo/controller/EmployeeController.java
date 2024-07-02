package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.New1.Model.Employee;
import com.example.demo.Service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	@GetMapping("/show")
	public List<Employee> getEmployee() {
		return employeeService.getEmployee();
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PostMapping("/addAll")
	public String addEmployees(@RequestBody List<Employee> employees) {
		return employeeService.addEmployees(employees);
	}
	
	@PutMapping("/update/{EmID}")
	public String modifyEmployeeRecord(@PathVariable Integer EmID, @RequestBody Employee employee) {
		return employeeService.updateEmployee(EmID, employee);
	}
}
