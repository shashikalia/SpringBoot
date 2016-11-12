package com.shashi.dao;

import org.springframework.data.repository.CrudRepository;

import com.shashi.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
