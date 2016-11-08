package com.shashi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String departmentName;
	
	@Column(nullable=false)
	private String location;
	
	@Column(nullable=false)
	private String function;
	
	public Department(){}
	
	public Department(String departmentName, String location, String function) {
		super();
		this.departmentName = departmentName;
		this.location = location;
		this.function = function;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
}
