package com.shashi.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.shashi.entity.Employee;

@Component("EmployeeDao")
@Qualifier("EmployeeDaoImplementation")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	private final EmployeeRepository employeeRepository;
	
	public EmployeeDaoImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Iterable<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {
		return this.employeeRepository.findOne(employeeId);
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		this.employeeRepository.delete(employeeId);
		
	}

	@Override
	public void updateEmployeeById(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public void addEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	
	
}
