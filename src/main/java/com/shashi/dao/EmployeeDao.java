package com.shashi.dao;

import java.util.List;

import com.shashi.entity.Employee;

public interface EmployeeDao {

	public Iterable<Employee> getAllEmployee();
	public Employee getEmployeeById(Long employeeId);
	public void deleteEmployeeById(Long employeeId);
	public Employee updateEmployeeById(Employee employee);
	public void addEmployee(Employee employee);
	public List<Employee> getEmployeeByDepartmentName(String departmentName);
	
}
