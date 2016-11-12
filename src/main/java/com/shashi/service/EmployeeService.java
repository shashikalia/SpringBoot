package com.shashi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shashi.dao.EmployeeDao;
import com.shashi.entity.Employee;

@Service
/**
 * 
 * @author shashi
 * TODO write the business logic in this Service class
 * Right now it is only interacting with persistent layer
 *
 */
public class EmployeeService {

	@Autowired
	@Qualifier("EmployeeDaoImplementation")
	private EmployeeDao employeeDao;
	
	public Iterable<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
	public Employee getEmployeeById(Long employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	public void deleteEmployeeById(Long employeeId) {
		employeeDao.deleteEmployeeById(employeeId);
	}

	public void updateEmployeeById(Employee employee) {
		employeeDao.updateEmployeeById(employee);
	}

	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
}
