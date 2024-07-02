package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.New1.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
	


}
