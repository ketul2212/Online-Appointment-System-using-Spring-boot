package com.ketul.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@Entity
@Table(name = "doctor_availability")
public class Availability{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int available_id;

	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
	
	@ManyToOne(targetEntity=Doctor.class)
	@JoinColumn(name="doctor_email")
	private Doctor doctor;
	
	private String date;
	
	private String startTime;
	
	private String endTime;
	
	private String slot;
	
	private String available = "true";


	public Availability(int available_id, Timestamp createdAt, Doctor doctor, String date, String startTime,
			String endTime, String available) {
		super();
		this.available_id = available_id;
		this.createdAt = createdAt;
		this.doctor = doctor;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.available = available;
	}
	
	
	public Availability(int available_id, Timestamp createdAt, Doctor doctor, String date, String startTime,
			String endTime, String available, String slot) {
		super();
		this.available_id = available_id;
		this.createdAt = createdAt;
		this.doctor = doctor;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.available = available;
		this.slot = slot;
	}
	
	
	public Availability() {
		
	}


	public int getAvailable_id() {
		return available_id;
	}
	public void setAvailable_id(int available_id) {
		this.available_id = available_id;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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
	
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}


	@Override
	public String toString() {
		return "Availability [available_id=" + available_id + ", createdAt=" + createdAt + ", doctor=" + doctor
				+ ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime + ", slot=" + slot
				+ ", available=" + available + "]";
	}
}
