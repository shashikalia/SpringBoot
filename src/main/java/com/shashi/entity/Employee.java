package com.shashi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@ManyToOne
	@NaturalId
	private Department department;
	
	@Column(nullable=false)
	private String designation;
	
	@Column(nullable=false)
	private String contactNumber;
	
	public Employee() {}
	
	public Employee(int id, String name, Department department, String designation,
			String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department + ", designation=" + designation
				+ ", contactNumber=" + contactNumber + "]";
	}

}
