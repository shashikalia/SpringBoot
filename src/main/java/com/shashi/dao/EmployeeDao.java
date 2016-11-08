package com.shashi.dao;

import java.util.Collection;

import com.shashi.entity.Employee;

public interface EmployeeDao {

	public Collection<Employee> getAllEmployee();
	public Employee getEmployeeById(int employeeId);
	public void deleteEmployeeById(int employeeId);
	public void updateEmployeeById(Employee employee);
	public void addEmployee(Employee employee);
	
}
