package com.shashi.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.shashi.entity.Department;
import com.shashi.entity.Employee;

@Repository
@Qualifier("EmployeeDaoTest")
public class EmployeeDaoTest implements EmployeeDao {

	private static Map<Integer, Employee> employees = new HashMap<Integer,Employee>() {
		private static final long serialVersionUID = -6425626884178491264L;
		{
			put(1,new Employee(1,"John", new Department("Networking","D1","Network"), "Network Specialist", "+3246598434"));
			put(2,new Employee(2,"Martin", new Department("IT","D2","IT Issues"), "Product Manager", "+3234324455"));
			put(3,new Employee(3,"Usher", new Department("Sales","D3","Revenue"), "BU Head", "+3212345678"));
			put(4,new Employee(4,"Raman", new Department("HR","D4","Resource Management"), "Senior Manager", "+3287654321"));
		}
	};
	
	@Override
	public Collection<Employee> getAllEmployee() {
		return employees.values();
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		return employees.get(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employees.remove(employeeId);
		
	}

	@Override
	public void updateEmployeeById(Employee employee) {
		Employee employeeToUpdate = employees.get(employee.getId());
		employeeToUpdate.setName(employee.getName());
		employeeToUpdate.setDepartment(employee.getDepartment());
		employeeToUpdate.setDesignation(employee.getDesignation());
		employeeToUpdate.setContactNumber(employee.getContactNumber());
		
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
	}
	
}
