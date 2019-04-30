package com.example.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2.model.Employee;
import com.example.h2.repository.EmployeeRepository;

@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService {

	

	@Autowired

	EmployeeRepository employeeRepository; 



	@Override

	public Employee getEmployeeById(long id) {

		return employeeRepository.findOne(id);

	}



	@Override

	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();

	}



}
