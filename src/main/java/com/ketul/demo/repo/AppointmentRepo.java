package com.ketul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketul.demo.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
