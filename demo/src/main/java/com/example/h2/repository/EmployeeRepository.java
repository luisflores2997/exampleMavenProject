package com.example.h2.repository;

import com.example.h2.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}