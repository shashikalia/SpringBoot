package com.shashi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.entity.Employee;
import com.shashi.service.EmployeeService;

@RestController	
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Employee getEmployeeById(@PathVariable("id")int employeeId) {
		return this.employeeService.getEmployeeById(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteEmployeeById(@PathVariable("id")int employeeId) {
		this.employeeService.deleteEmployeeById(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployeeById(@RequestBody Employee employee) {
		this.employeeService.updateEmployeeById(employee);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody Employee employee) {
		this.employeeService.addEmployee(employee);
	}
}
