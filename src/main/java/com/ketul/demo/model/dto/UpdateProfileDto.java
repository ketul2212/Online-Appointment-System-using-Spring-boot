package com.ketul.demo.model.dto;

public class UpdateProfileDto {
	private String degree;
	private String spacialization;
	private Integer experience;
	private String nclinic;
	private String aclinic;
	private String profile;
	private String age;
	private String gender;
	private String bloodgroup;
	private Long number;
	private String role;
	
	public UpdateProfileDto() {
		
	}

	public UpdateProfileDto(String degree, String spacialization, Integer experience, String nclinic, String aclinic,
			String profile, String age, String gender, String bloodgroup, Long number, String role) {
		super();
		this.degree = degree;
		this.spacialization = spacialization;
		this.experience = experience;
		this.nclinic = nclinic;
		this.aclinic = aclinic;
		this.profile = profile;
		this.age = age;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.number = number;
		this.role = role;
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

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UpdateProfileDto [degree=" + degree + ", spacialization=" + spacialization + ", experience="
				+ experience + ", nclinic=" + nclinic + ", aclinic=" + aclinic + ", profile=" + profile + ", age=" + age
				+ ", gender=" + gender + ", bloodgroup=" + bloodgroup + ", number=" + number + ", role=" + role + "]";
	}
}
