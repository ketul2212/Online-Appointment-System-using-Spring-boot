package com.ketul.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointment_id;

	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
	
	private String date;
	
	private String startTime;
	
	private String endTime;
	
	private String status = "PANDING";

	private String doctorName;
	
	public Appointment() {
		
	}
	
	public Appointment(String date, String startTime, String endTime, String status, String doctorName) {
		super();
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.doctorName = doctorName;
	}

	
	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", createdAt=" + createdAt + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + ", doctorName="
				+ doctorName + "]";
	}
	
	
}
