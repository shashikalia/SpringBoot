package com.shashi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.entity.Employee;
import com.shashi.service.EmployeeService;

@RestController	
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.GET,params="id")
	public Employee getEmployeeById(@RequestParam("id")Long employeeId) {
		return this.employeeService.getEmployeeById(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.GET, params="department")
	public List<Employee> getEmployeeByDepartmentName(@RequestParam("department")String departmentName) {
		return this.employeeService.getEmployeeByDepartmentName(departmentName);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteEmployeeById(@PathVariable("id")Long employeeId) {
		this.employeeService.deleteEmployeeById(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployeeById(@RequestBody Employee employee) {
		return this.employeeService.updateEmployeeById(employee);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody Employee employee) {
		this.employeeService.addEmployee(employee);
	}
}
