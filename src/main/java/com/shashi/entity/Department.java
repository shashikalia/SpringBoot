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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result
				+ ((function == null) ? 0 : function.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
}
