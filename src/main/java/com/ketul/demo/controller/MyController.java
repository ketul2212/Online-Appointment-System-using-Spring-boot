package com.ketul.demo.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ketul.demo.model.Appointment;
import com.ketul.demo.model.Availability;
import com.ketul.demo.model.Doctor;
import com.ketul.demo.model.User;
import com.ketul.demo.model.dto.UpdateProfileDto;
import com.ketul.demo.model.dto.UserDto;
import com.ketul.demo.repo.AppointmentRepo;
import com.ketul.demo.repo.AvailabilityRepo;
import com.ketul.demo.repo.DocRepo;
import com.ketul.demo.serviceImp.ServiceImp;

@Controller
public class MyController {
	
	@Autowired
	private ServiceImp serviceImp;
	
	@Autowired
	private DocRepo docRepo;
	
	@Autowired
	private AvailabilityRepo availabilityRepo;
	
	@Autowired
	private AppointmentRepo appointmentRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/")
	public String wel() {
		return ("index.jsp");
	}
	
	@PostMapping("reg")
	public String saveUser(UserDto userDto){
		User user = mapper.map(userDto, User.class);
		return serviceImp.saveAndGet(user, userDto);
	}
	
	@RequestMapping("dashbord")
	public String dashbord() {
		return ("dashbord.jsp");
	}
	
	@RequestMapping("/dashbord/availability")
	public String avilable() {
		return "redirect:/availability.jsp";
	}
	
	@RequestMapping("/addAvailability")
	public ModelAndView addAvailability(Availability availability) {
		return serviceImp.saveAvailability(availability);
	}

	@RequestMapping("/saveApprovedAvailability")
	public String saveApprovedAvailability() {
		return serviceImp.saveApprovedAvailability();
	}
	
	
	@RequestMapping("/appointment")
	public ModelAndView appointment() {
		ModelAndView mv = new ModelAndView("appointment.jsp");
		mv.addObject("doctor", docRepo.findAll());
		
		List<Availability> availabilityList  = availabilityRepo.findAll();
		
		Iterator<Availability> itr = availabilityList.iterator();
		
		while(itr.hasNext()) {
			Availability availability = (Availability)itr.next();
			
			if(availability.getAvailable().equals("false"))
				itr.remove();
		}
		
		mv.addObject("listAvailabilityTime", availabilityList);
		return mv;
	}
	
	@RequestMapping("/addAppointment")
	public String appointment(Appointment appointment) {
		return serviceImp.saveAppointment(appointment);
	}
	
	@RequestMapping("/appointments")
	public ModelAndView appointments() {
		return serviceImp.showAppointments();
	}
	
	@RequestMapping("/accept")
	public String accept(String appointment_id) {
		System.out.println(appointment_id);
		return serviceImp.acceptAppointment(appointment_id);
	}
	
	@RequestMapping("/reject")
	public String reject(String appointment_id) {
		return serviceImp.rejectAppointment(appointment_id);
	}
	
	
	@RequestMapping("/show")
	public ModelAndView getAll() {
		return serviceImp.show();
	}
	
	@RequestMapping("updateProfile")
	public String updateProfile() {
		return "redirect:/update-profile.jsp";
	}
	
	@RequestMapping("/update")
	public String updateProfiles(UpdateProfileDto updateProfileDto) {
		return serviceImp.update(updateProfileDto);
	}
	
	
	@RequestMapping("/history")
	public ModelAndView getHistory() {
		return serviceImp.history();
	}
}
