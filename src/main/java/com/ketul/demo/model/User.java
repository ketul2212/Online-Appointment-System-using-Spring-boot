package com.ketul.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "user_info")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
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
	private String degree;
	private String spacialization;
	private String nclinic;
	private String aclinic;
	private String profile;
	
	
	//getter and setter
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpacialization() {
		return spacialization;
	}
	public void setSpacialization(String spacialization) {
		this.spacialization = spacialization;
	}
	public String getNclinic() {
		return nclinic;
	}
	public void setNclinic(String nclinic) {
		this.nclinic = nclinic;
	}
	public String getAclinic() {
		return aclinic;
	}
	public void setAclinic(String aclinic) {
		this.aclinic = aclinic;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

	
	//tostring
	@Override
	public String toString() {
		return "User [uid=" + uid + ", role=" + role + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", pass=" + pass + ", age=" + age + ", gender=" + gender + ", bloodgroup=" + bloodgroup
				+ ", number=" + number + ", degree=" + degree + ", spacialization=" + spacialization + ", nclinic="
				+ nclinic + ", aclinic=" + aclinic + ", profile=" + profile + ", appointmentMon=" 
				+ "]";
	}
}
