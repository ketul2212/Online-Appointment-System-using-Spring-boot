package com.ketul.demo.serviceImp;

import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.modelmapper.ModelMapper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.ketul.demo.model.Appointment;
import com.ketul.demo.model.Availability;
import com.ketul.demo.model.Doctor;
import com.ketul.demo.model.Patient;
import com.ketul.demo.model.User;
import com.ketul.demo.model.dto.UpdateProfileDto;
import com.ketul.demo.model.dto.UserDto;
import com.ketul.demo.repo.AppointmentRepo;
import com.ketul.demo.repo.AvailabilityRepo;
import com.ketul.demo.repo.DocRepo;
import com.ketul.demo.repo.MyRepo;
import com.ketul.demo.repo.PatRepo;

import java.util.Iterator;

@Service
public class ServiceImp implements UserDetailsService{
	

	private String uName;
	
	private Availability availability = new Availability();
	
	private UpdateProfileDto updateProfileDto = new UpdateProfileDto();
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AppointmentRepo appointmentRepo;
	
	@Autowired
    private AvailabilityRepo availabilityRepo;
	
	@Autowired
	private DocRepo docRepo;
	
	@Autowired
	private PatRepo patRepo;
	
	@Autowired
    private MyRepo myRepo;


	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = myRepo.findByEmail(email);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        if (user == null) {
            throw new UsernameNotFoundException("User not authorized.");
        } else {
        	updateProfileDto.setRole(user.getRole());
        	uName = user.getEmail();
//        	availability.setDoctor(new Doctor(user.getRole(), user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getDegree(), user.getSpacialization(), user.getExperience(), user.getAclinic(), user.getNclinic(), user.getProfile()));
        	availability.setDoctor(new Doctor(user.getRole(), user.getEmail(), user.getPass()));
        	grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
            System.out.println(availability);
            System.out.println(updateProfileDto.getRole());
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPass(), grantedAuthorities);
        }
	}
	
	public String saveAndGet(User user, UserDto userDto) {
		user.setPass(passwordEncoder.encode(user.getPass()));
		myRepo.save(user);
//		if(user.getRole().equals("ROLE_DOCTOR"))
//			docRepo.save(new Doctor(user.getRole(), user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getDegree(), user.getSpacialization(), user.getExperience(), user.getAclinic(), user.getNclinic(), user.getProfile()));
//		else
//			patRepo.save(new Patient(user.getRole(), user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getAge(), user.getGender(), user.getBloodgroup(), user.getNumber()));
//		
		if(user.getRole().equals("ROLE_DOCTOR"))
			docRepo.save(new Doctor(userDto.getFname(), userDto.getLname(), user.getEmail(), user.getPass(), user.getRole(), user));
		else
			patRepo.save(new Patient(userDto.getFname(), userDto.getLname(), user.getEmail(), user.getPass(), user.getRole(), user));

		
		return "redirect:/login";
	}


	public String saveAvailability(Availability availability) {
		availability.setDoctor(this.availability.getDoctor());
		
//		if(availabilityRepo.existsById(availability.getDoctor_A_id())) {
//			availability.
//		}
//		Doctor d = availabilityRepo.findByDoctor(availability.getDoctor());
//		if(d != null)
		
//		System.out.println(availability.getDoctor());
		
		String start = availability.getStartTime();
		String end = availability.getEndTime();
		
		String testStart = start;
		
//		System.out.println(!start.equals(end));
//		System.out.println(start + "   " + end);
		
		String[] splitTimeStart;
		
		int startPre = 0;
		
		if(!start.equals(end)) {
			do {
				
				System.out.println(testStart);

				splitTimeStart = testStart.split(":");
				startPre = Integer.parseInt(splitTimeStart[0]);
				
				if(startPre == 12)
					startPre = 0;
				
//				System.out.println(splitTimeStart[0] + "  " + splitTimeStart[1]);
				if(startPre == 11 && splitTimeStart[1].substring(2).equals("AM"))
					availability.setEndTime("" + (startPre + 1) + ":00PM");
				else if(startPre == 11 && splitTimeStart[1].substring(2).equals("PM"))
					availability.setEndTime("" + (startPre + 1) + ":00AM");
				else
					availability.setEndTime("" + (startPre + 1) + ":" +splitTimeStart[1]);

			
				availabilityRepo.save(new Availability(availability.getAvailable_id(), availability.getCreatedAt(), availability.getDoctor(), availability.getDate(), availability.getStartTime(), availability.getEndTime(), availability.getAvailable()));
				
				if(startPre == 11 && splitTimeStart[1].substring(2).equals("AM"))
					availability.setStartTime("" + (startPre + 1) + ":00PM");
				else if(startPre == 11 && splitTimeStart[1].substring(2).equals("PM"))
					availability.setStartTime("" + (startPre + 1) + ":00AM");
				else if(startPre >= 12)
					availability.setStartTime("" + 1 + ":" + splitTimeStart[1]);
				else
					availability.setStartTime("" + (startPre + 1) + ":" + splitTimeStart[1]);

				
				testStart = availability.getStartTime();
				
				
				try {
					Thread.sleep(10000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
//				System.out.println(testStart + " " + testEnd);
				System.out.println(end);
				
				
			} while(!testStart.equals(end));
		} 
		else
			return "redirect: /errorInAvailable";
		
		return "redirect:/login";
	}

//	public String saveAvailability(Availability availability) {
//		availability.setDoctor(this.availability.getDoctor());
//		
////		if(availabilityRepo.existsById(availability.getDoctor_A_id())) {
////			availability.
////		}
////		Doctor d = availabilityRepo.findByDoctor(availability.getDoctor());
////		if(d != null)
//		
////		System.out.println(availability.getDoctor());
//		
//		String start = availability.getStartTime();
//		String end = availability.getEndTime();
//		int slot = Integer.parseInt(availability.getSlot());
//		
//		String testStart = start;
//		
////		System.out.println(!start.equals(end));
////		System.out.println(start + "   " + end);
//		
//		String[] splitTimeStart, splitTimeEnd;
//		
//		int startPre = 0, startPost = 0;
//		
//		if(!start.equals(end)) {
//			do {
//				
////				System.out.println(testStart + " " + testEnd);
//
//				splitTimeStart = testStart.split(":");
//				startPre = Integer.parseInt(splitTimeStart[0]);
//				startPost = Integer.parseInt(splitTimeStart[1].substring(0, 2));
//				
//				if(splitTimeStart[1].substring(0, 2).equals("50"))
//					availability.setEndTime("" + (startPre + 1) + ":00PM");
//					
//				if(startPre == 12)
//					startPre = 0;
//				
////				System.out.println(splitTimeStart[0] + "  " + splitTimeStart[1]);
//				if(startPre == 11 && splitTimeStart[1].substring(2).equals("AM"))
//					availability.setEndTime("" + startPre + ":" + (startPost + slot) + "PM");
//				else if(startPre == 11 && splitTimeStart[1].substring(2).equals("PM"))
//					availability.setEndTime("" + (startPre) + ":" + (startPost + slot) + "AM");
//				else
//					availability.setEndTime("" + (startPre) + ":" + (startPost + slot));
//
//			
//				availabilityRepo.save(new Availability(availability.getAvailable_id(), availability.getCreatedAt(), availability.getDoctor(), availability.getDate(), availability.getStartTime(), availability.getEndTime(), availability.getAvailable()));
//				
//				if(startPre == 11 && splitTimeStart[1].substring(2).equals("AM"))
//					availability.setStartTime("" + (startPre) + ":" + (startPost + slot) + "PM");
//				else if(startPre == 11 && splitTimeStart[1].substring(2).equals("PM"))
//					availability.setStartTime("" + (startPre) + ":" + (startPost + slot) + "AM");
//				else if(startPre == 12 && splitTimeStart[1].substring(0, 1).equals("50"))
//					availability.setStartTime("" + 1 + ":" + 00 + splitTimeStart[1].substring(2));
//				else
//					availability.setStartTime("" + (startPre) + ":" + (startPost + slot) + splitTimeStart[1].substring(2));
//
//				
//				testStart = availability.getStartTime();
//				
//			} while(!testStart.equals(end));
//		} 
//		else
//			return "redirect: /errorInAvailable";
//		
//		return "redirect:/login";
//	}

	
	
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("show.jsp");
		mv.addObject("doctor", docRepo.findAll());
		return mv;
	}

	public String saveAppointment(Appointment appointment) {
		List<Availability> available = availabilityRepo.findAll();
		
//		System.out.println(available);
		
		boolean flag = false;
		String[] startSplit = appointment.getStartTime().split(":");
		int start = Integer.parseInt(startSplit[0]);
		start++;
		if(start == 13)
			start = 1;
		if(start == 12 && startSplit[1].substring(2).equals("AM"))
			appointment.setEndTime("" + start + ":00PM");
		else if(start == 12 && startSplit[1].substring(2).equals("PM"))
			appointment.setEndTime("" + start + ":00AM");
		else
			appointment.setEndTime("" + start + ":" + startSplit[1]);
//		System.out.println(appointment.getStartTime() + "   " + appointment.getEndTime());
		for(Availability availability : available) {
			if(availability.getDoctor().getFname().equals(appointment.getDoctorName())) {
				if(availability.getDate().equals(appointment.getDate()) && availability.getStartTime().equals(appointment.getStartTime()) && availability.getEndTime().equals(appointment.getEndTime()) && availability.getAvailable().equals("true")) {
					appointment.setStatus("PANDING");
					
//					System.out.println(availability);
					appointment.setDoctorName(availability.getDoctor().getEmail());
					appointmentRepo.save(appointment);
					
					availability.setAvailable("false");
					availabilityRepo.save(availability);
					flag = true;
					break;
				}
			}
		}
		
		if(flag != true)
			return "redirect:/NotAvailableDoctor";
			
		
		return "redirect:/login";
	}

	public ModelAndView showAppointments() {
		ModelAndView mv = new ModelAndView("appointments.jsp");
		
		List<Appointment> listAppointment = appointmentRepo.findAll();
		Doctor doctor = availability.getDoctor();
		
		Iterator<Appointment> itr = (Iterator<Appointment>) listAppointment.iterator();
		
		while(itr.hasNext()) {
			Appointment appointment = (Appointment) itr.next();
			
			if(!appointment.getDoctorName().equals(doctor.getEmail()) || appointment.getStatus().equals("BOOKED") || appointment.getStatus().equals("REJECTED"))
				itr.remove();
		}
		mv.addObject("appointment", listAppointment);
		return mv;
	}

	public String acceptAppointment(String appointment_id) {
		Appointment appointment = appointmentRepo.findById(Integer.parseInt(appointment_id)).orElse(new Appointment());
		appointment.setStatus("BOOKED");
		appointmentRepo.save(appointment);
		return "redirect:/login";
	}
	
	public String rejectAppointment(String appointment_id) {
		Appointment appointment = appointmentRepo.findById(Integer.parseInt(appointment_id)).orElse(new Appointment());
		appointment.setStatus("REJECTED");
		appointmentRepo.save(appointment);
		return "redirect:/login";
	}

	public String update(UpdateProfileDto updateProfileDto) {
		if(this.updateProfileDto.getRole().equals("ROLE_DOCTOR")) {
//			System.out.println(uName);
			
			List<Doctor> listDoctor = docRepo.findAll();
			
			for(Doctor doctor : listDoctor) {
				if(doctor.getEmail().equals(uName)) {
					doctor.setDegree(updateProfileDto.getDegree());
					doctor.setAclinic(updateProfileDto.getAclinic());
					doctor.setNclinic(updateProfileDto.getNclinic());
					doctor.setExperience(updateProfileDto.getExperience());
					doctor.setSpacialization(updateProfileDto.getSpacialization());
					doctor.setProfile(updateProfileDto.getProfile());
					
					docRepo.save(doctor);
					break;
				}
			}
		}
		else {
			List<Patient> listPatient = patRepo.findAll();
			
			for(Patient patient : listPatient) {
				if(patient.getEmail().equals(uName)) {
					patient.setAge(updateProfileDto.getAge());
					patient.setBloodgroup(updateProfileDto.getBloodgroup());
					patient.setGender(updateProfileDto.getGender());
					patient.setNumber(updateProfileDto.getNumber());
					
					patRepo.save(patient);
					break;
				}
			}
		}
		return "redirect:/login";
	}

	
}
