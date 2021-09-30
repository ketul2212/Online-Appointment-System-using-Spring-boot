package com.ketul.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String role;
	private String fname;
	private String lname;
	@Column(nullable = false, unique = true)
	private String email;
	private String pass;
	private String age;
	private String gender;
	private String bloodgroup;
	private Long number;
	public Patient(String role, String fname, String lname, String email, String pass, String age,
			String gender, String bloodgroup, Long number) {
		super();
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.age = age;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.number = number;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Patient [did=" + did + ", role=" + role + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", pass=" + pass + ", age=" + age + ", gender=" + gender + ", bloodgroup=" + bloodgroup
				+ ", number=" + number + "]";
	}
	
}
