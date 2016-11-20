package com.shashi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UserLogin {

	@Id
	@GeneratedValue
	private Long userLoginId;
	
	private Long employeeId;
	
	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String password;

	public UserLogin(){}
	
	public UserLogin(UserLogin user) {
		this.userLoginId=user.userLoginId;
		this.employeeId=user.employeeId;
		this.userName=user.userName;
		this.password=user.password;
	}

	public Long getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(Long userLoginId) {
		this.userLoginId = userLoginId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
