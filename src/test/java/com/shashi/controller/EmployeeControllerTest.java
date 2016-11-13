package com.shashi.controller;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shashi.entity.Department;
import com.shashi.entity.Employee;

public class EmployeeControllerTest {

	EmployeeController employeeController;
	
	@Before
	public void beforeTest() {
		employeeController = new EmployeeController();
		Employee employee = new Employee(10L,"TESTEmployee", new Department("TestNetworking","D1","Network"), 
				"Network Specialist", "+3246598434");
		employeeController.addEmployee(employee);
	}
	
	@Test
	public void getEmployeeByIdTest() {
		Employee employee = employeeController.getEmployeeById(10L);
		assertTrue(employee.getId() == 10L);
	}
	
	@Test
	public void getEmployeeByDepartmentNameTest() {
		List<Employee> employees = employeeController.getEmployeeByDepartmentName("TestNetworking");
		for(Employee employee: employees) {
			assertTrue(employee.getDepartment().getDepartmentName().equals("TestNetworking"));
		}
	}
	
	@Test
	public void updateEmployeeByDepartmentNameTest() {
		Employee employee = new Employee(10L,"TESTEmployeeUpdated", new Department("TestNetworking","D1","Network"), 
				"Network Specialist", "+3246598434");
		
		Employee employeeUpdated = employeeController.updateEmployeeById(employee);
		
		assertTrue(employeeUpdated.equals(employee));

	}
	
	@After
	public void afterTest() {
		employeeController.deleteEmployeeById(10L);
	}

}
