package com.shashi.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.shashi.entity.Employee;

@Repository
@Qualifier("H2Database")
public class EmployeeDaoH2Database implements EmployeeDao {

	@Override
	public Collection<Employee> getAllEmployee() {
		return null;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return null;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
	}

	@Override
	public void updateEmployeeById(Employee employee) {
	}

	@Override
	public void addEmployee(Employee employee) {
	}

}
