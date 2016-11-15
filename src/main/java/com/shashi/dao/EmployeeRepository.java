package com.shashi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shashi.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	List<Employee> findByDepartmentDepartmentNameIgnoreCase(String departmentName);
	
}
