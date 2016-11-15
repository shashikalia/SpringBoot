package com.shashi.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.shashi.entity.Department;
import com.shashi.entity.Employee;

@Repository
@Qualifier("EmployeeDaoTest")
public class EmployeeDaoTest implements EmployeeDao {

	private static Map<Long, Employee> employees = new HashMap<Long,Employee>() {
		private static final long serialVersionUID = -6425626884178491264L;
		{
			put(1L,new Employee(1L,"John", new Department("Networking","D1","Network"), "Network Specialist", "+3246598434"));
			put(2L,new Employee(2L,"Martin", new Department("IT","D2","IT Issues"), "Product Manager", "+3234324455"));
			put(3L,new Employee(3L,"Usher", new Department("Sales","D3","Revenue"), "BU Head", "+3212345678"));
			put(4L,new Employee(4L,"Raman", new Department("HR","D4","Resource Management"), "Senior Manager", "+3287654321"));
		}
	};
	
	@Override
	public Collection<Employee> getAllEmployee() {
		return employees.values();
	}
	
	@Override
	public Employee getEmployeeById(Long employeeId) {
		return employees.get(employeeId);
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		employees.remove(employeeId);
		
	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
		Employee employeeToUpdate = employees.get(employee.getId());
		employeeToUpdate.setName(employee.getName());
		employeeToUpdate.setDepartment(employee.getDepartment());
		employeeToUpdate.setDesignation(employee.getDesignation());
		employeeToUpdate.setContactNumber(employee.getContactNumber());
		return employeeToUpdate;
		
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
	}

	@Override
	public List<Employee> getEmployeeByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
