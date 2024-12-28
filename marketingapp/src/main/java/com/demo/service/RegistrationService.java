package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void addRegistration(Registration registration) {
		registrationRepository.save(registration);
		
	}

	public List<Registration> getRegistrations() {
		List<Registration> registrations = registrationRepository.findAll();
		return registrations;
	}

	public void deleteRegistration(long id) {
		registrationRepository.deleteById(id);
		
	}

	public Registration getReg(long id) {
		Optional<Registration> byId =registrationRepository.findById(id);
		if(byId.isPresent()) {
			Registration registration = byId.get();
			return registration;
		}
		return null;
		
	}

	public void updateRegistration(Registration registration) {
		registrationRepository.save(registration);
		
		
	}

}
