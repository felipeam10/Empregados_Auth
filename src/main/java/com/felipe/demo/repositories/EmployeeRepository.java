package com.felipe.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
