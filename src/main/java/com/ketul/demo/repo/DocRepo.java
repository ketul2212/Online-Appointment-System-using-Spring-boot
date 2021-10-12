package com.ketul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketul.demo.model.Doctor;

public interface DocRepo extends JpaRepository<Doctor, Integer>{

	Doctor findByspacialization(String spacialization);
	
}

