package com.ketul.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ketul.demo.model.User;

import com.ketul.demo.serviceImp.ServiceImp;

@Controller
public class MyController {
	
	@Autowired
	private ServiceImp serviceImp;
	
	@GetMapping("/")
	public String wel() {
		return ("index.jsp");
	}
	
	@PostMapping("reg")
	public String saveUser(User user){
		return serviceImp.saveAndGet(user);
	}
	
	@RequestMapping("dashbord")
	public String dashbord() {
		return ("dashbord.jsp");
	}
	
	@RequestMapping("/dashboard/availability")
	public String avilable() {
		return "redirect:/availability";
	}
	
	@RequestMapping("availability")
	public String avi() {
		return ("availability.jsp");
	}
}
