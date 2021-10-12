package com.ketul.demo.model.dto;

import javax.persistence.Column;

public class UserDto {
	private String role;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	
	public UserDto() {
		
	}
	
	public UserDto(String role, String fname, String lname, String email, String pass) {
		super();
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserDto [role=" + role + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ "]";
	}
	
	
}
