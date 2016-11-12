package com.shashi.dao;

import com.shashi.entity.Employee;

public interface EmployeeDao {

	public Iterable<Employee> getAllEmployee();
	public Employee getEmployeeById(Long employeeId);
	public void deleteEmployeeById(Long employeeId);
	public void updateEmployeeById(Employee employee);
	public void addEmployee(Employee employee);
	
}
