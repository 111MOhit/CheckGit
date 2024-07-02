package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.New1.Model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getEmployee() {
		return repository.findAll();		
	}
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public String updateEmployee(Integer EmID, Employee employee) {
		Optional<Employee> validateEmployeeRecord = repository.findById(EmID);
		
		if (!validateEmployeeRecord.isPresent()) {
			return "There is no Employee found by the provided ID.";
		}
		
		Employee existingEmployee = validateEmployeeRecord.get();
		
		// Assuming you only update the following fields
		existingEmployee.setEmID(employee.getEmID());
		existingEmployee.setEm_Name(employee.getEm_Name());
		existingEmployee.setEm_age(employee.getEm_age());
		existingEmployee.setEm_salary(employee.getEm_salary());
		
		repository.save(existingEmployee);
		return "Record Updated Successfully";
	}
	
	public String addEmployees(List<Employee> employee) {
		repository.saveAll(employee);
		return "All Employee records added to the database";
	}
}
