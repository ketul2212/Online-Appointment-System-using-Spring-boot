package com.ketul.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int history_id;
	
	private String patientName;
	
	@OneToOne(targetEntity=Appointment.class)
	@JoinColumn(name="appointment_id")
	private Appointment appointment;

	public History() {
		super();
	}

	public History(String patientName, Appointment appointment) {
		super();
		this.patientName = patientName;
		this.appointment = appointment;
	}

	public int getHistory_id() {
		return history_id;
	}

	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "History [history_id=" + history_id + ", patientName=" + patientName + ", appointment=" + appointment
				+ "]";
	}

}
