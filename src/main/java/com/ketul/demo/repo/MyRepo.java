package com.ketul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ketul.demo.model.User;

public interface MyRepo extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
