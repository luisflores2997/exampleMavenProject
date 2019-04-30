package com.example.h2.service;

import java.util.List;

import com.example.h2.model.Employee;;;

public interface EmployeeService {
	Employee getEmployeeById(long id);

	List<Employee> getAllEmployees();

}
