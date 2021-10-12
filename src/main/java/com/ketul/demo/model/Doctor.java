package com.ketul.demo.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "doctor")
public class Doctor{
	
	private String role;
	private String fname;
	private String lname;
	@Id
	@Column(unique = true, nullable = true)
	private String email;
	private String pass;
	private String degree;
	private String spacialization;
	private Integer experience;
	private String nclinic;
	private String aclinic;
	private String profile;
	
	@OneToOne(targetEntity=User.class)
	@JoinColumn(name="uid")
	private User user;
	
	public Doctor(String role, String email, String pass) {
		this.role = role;
		this.email = email;
		this.pass = pass;
	}
	
	public Doctor() {
		
	}
	
	public Doctor(String role, String fname, String lname, String email, String pass, String degree,
			String spacialization, Integer experience, String nclinic, String aclinic, String profile, User user) {
		super();
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.degree = degree;
		this.spacialization = spacialization;
		this.experience = experience;
		this.nclinic = nclinic;
		this.aclinic = aclinic;
		this.profile = profile;
		this.user = user;
	}

	public Doctor(String fname, String lname, String email, String pass, String role, User user) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.role = role;
		this.user = user;
	}
	
//	public Doctor(String role, String fname, String lname, String email, String pass, String degree,
//			String spacialization, String nclinic, String aclinic, String profile, Availability availability) {
//		super();
//		this.role = role;
//		this.fname = fname;
//		this.lname = lname;
//		this.email = email;
//		this.pass = pass;
//		this.degree = degree;
//		this.spacialization = spacialization;
//		this.nclinic = nclinic;
//		this.aclinic = aclinic;
//		this.profile = profile;
//		this.availability = availability;
//	}


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

//	public Availability getAvailability() {
//		return availability;
//	}
//
//	public void setAvailability(Availability availability) {
//		this.availability = availability;
//	}

	public Integer getExperience() {
		return experience;
	}



	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Doctor [role=" + role + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ ", degree=" + degree + ", spacialization=" + spacialization + ", experience=" + experience
				+ ", nclinic=" + nclinic + ", aclinic=" + aclinic + ", profile=" + profile + ", user=" + user + "]";
	}

}
