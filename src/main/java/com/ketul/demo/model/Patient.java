package com.ketul.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
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
	
	@OneToOne(targetEntity=User.class)
	@JoinColumn(name="uid")
	private User user;
	
	
	public Patient(String role, String fname, String lname, String email, String pass, String age,
			String gender, String bloodgroup, Long number, User user) {
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
		this.user = user;
	}
	
	public Patient(String fname, String lname, String email, String pass, String role, User user) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.role = role;
		this.user = user;
	}
	
	public Patient() {
		
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", role=" + role + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", pass=" + pass + ", age=" + age + ", gender=" + gender + ", bloodgroup=" + bloodgroup + ", number="
				+ number + ", user=" + user + "]";
	}
}
