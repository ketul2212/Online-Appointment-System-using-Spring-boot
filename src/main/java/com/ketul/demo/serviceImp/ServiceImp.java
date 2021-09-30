package com.ketul.demo.serviceImp;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ketul.demo.model.Doctor;
import com.ketul.demo.model.Patient;
import com.ketul.demo.model.User;
import com.ketul.demo.repo.DocRepo;
import com.ketul.demo.repo.MyRepo;
import com.ketul.demo.repo.PatRepo;

@Service
public class ServiceImp implements UserDetailsService{
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
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
            grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPass(), grantedAuthorities);
        }
	}
	
	public String saveAndGet(User user) {
		user.setPass(passwordEncoder.encode(user.getPass()));
		myRepo.save(user);
		if(user.getRole().equals("ROLE_DOCTOR"))
			docRepo.save(new Doctor(user.getRole(), user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getDegree(), user.getSpacialization(), user.getAclinic(), user.getNclinic(), user.getProfile()));
		else
			patRepo.save(new Patient(user.getRole(), user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getAge(), user.getGender(), user.getBloodgroup(), user.getNumber()));
		
		
		return "redirect:/login";
	}

}
