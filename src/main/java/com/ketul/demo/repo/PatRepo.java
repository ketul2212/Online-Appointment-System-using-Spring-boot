package com.ketul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketul.demo.model.Patient;

public interface PatRepo extends JpaRepository<Patient, Integer>{
	
}

