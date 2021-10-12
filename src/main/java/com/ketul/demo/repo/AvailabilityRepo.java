package com.ketul.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ketul.demo.model.Availability;
import com.ketul.demo.model.Doctor;

public interface AvailabilityRepo extends JpaRepository<Availability, Integer> {

}
