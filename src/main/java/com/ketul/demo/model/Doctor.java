package com.ketul.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "doctor")
public class Doctor{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String role;
	private String fname;
	private String lname;
	@Column(nullable = false, unique = true)
	private String email;
	private String pass;
	private String degree;
	private String spacialization;
	private String nclinic;
	private String aclinic;
	private String profile;
	
	
	
	public Doctor(String role, String fname, String lname, String email, String pass, String degree,
			String spacialization, String nclinic, String aclinic, String profile) {
		super();
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.degree = degree;
		this.spacialization = spacialization;
		this.nclinic = nclinic;
		this.aclinic = aclinic;
		this.profile = profile;
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
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", role=" + role + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", pass=" + pass + ", degree=" + degree + ", spacialization=" + spacialization + ", nclinic="
				+ nclinic + ", aclinic=" + aclinic + ", profile=" + profile + "]";
	}
	
	
	
}
