package com.shashi.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.shashi.dao.EmployeeDao;
import com.shashi.entity.Department;
import com.shashi.entity.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@Mock
	EmployeeDao employeeDao;
	
	@InjectMocks
	EmployeeService employeeService = new EmployeeService();
	
	@Test
	public void getEmployeeByDepartmentNameTest() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10L,"TESTEmployee", new Department("TestNetworking","D1","Network"), 
				"Network Specialist", "+3246598434"));
		
		Mockito.stub(employeeDao.getEmployeeByDepartmentName(Mockito.anyString())).toReturn(employees);
		
		List<Employee> employeeOutput = employeeService.getEmployeeByDepartmentName("TestNetworking");
		
		for(Employee employee:employeeOutput) {
			assertTrue(employee.getDepartment().getDepartmentName().equals("TestNetworking"));
		}
		
	}

}
