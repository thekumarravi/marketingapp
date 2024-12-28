package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dto.RegistrationDto;
import com.demo.entity.Registration;
import com.demo.util.EmailService;



@Controller
public class RegistratinController {
	
	@Autowired
	private com.demo.service.RegistrationService RegistrationService;
	@Autowired
	private EmailService emailService;
		
	
	//http://localhost:8080/viewReg
	
	@RequestMapping("/viewReg")
	public String viewRegistrationPage() {
		return "add-registration";
		
	}
	
	   // @RequestMapping( "/saveReg")
	   // public String addRegistration(Registration registration,ModelMap model) {
		//RegistrationService.addRegistration(registration);
	    //model.addAttribute("msg", "Record is saved!!");
       // return "add-registration";
		//}
	
//	@RequestMapping( "/saveReg")
//	public String addRegistration(		
//		@RequestParam("FullName") String fullName,
//		@RequestParam("email") String email,
//		@RequestParam("mobile") Long mobile,
//		ModelMap model
//		
//	) {
//		
//    Registration registration = new Registration();
//    registration.setName(fullName);
//    registration.setEmail(email);
//    registration.setMobile(mobile);
//	  RegistrationService.addRegistration(registration);
//	  model.addAttribute("msg", "Record is saved!!");
//    return "add-registration";

 //   }
	
	


 @RequestMapping( "/saveReg")
 public String addRegistration(@ModelAttribute RegistrationDto registrationDto, ModelMap model) {

	 Registration registration = new Registration();
	 registration.setName(registrationDto.getName());
	 registration.setEmail(registrationDto.getEmail());
	 registration.setMobile(registrationDto.getMobile());
	 RegistrationService.addRegistration(registration);
	 emailService.sendEmail(registration.getEmail(), "Test Message", "Welcome to testing");
     model.addAttribute("msg", "Record is saved!!");
     return "add-registration";
	}
	 
	 
	 
 
 @RequestMapping( "/allReg")
 public String getRegistrations(ModelMap Model) {
	List<Registration> registrations = RegistrationService.getRegistrations();
	Model.addAttribute("registrations", registrations);
	return "all_registration";
	 
 }
 
 @RequestMapping("/delete")
 public String deleteRegistration(@RequestParam long id, Model model) {
	 RegistrationService.deleteRegistration(id);
	 List<Registration> registrations = RegistrationService.getRegistrations();
		model.addAttribute("registrations", registrations);
		return "all_registration";
	 
 }
 
 @RequestMapping("/getById")
 public String getRegistrationById(@RequestParam long id,Model model) {
	Registration registration = RegistrationService.getReg(id);
	 model.addAttribute(registration);
	 return "update_registration";
	 
 }
 @RequestMapping("/UpdateReg")
 public String updateReg(RegistrationDto dto,Model model) {
	 Registration registration = new Registration();
	 registration.setId(dto.getId());
	 registration.setName(dto.getName());
	 registration.setEmail(dto.getEmail());
	 registration.setMobile(dto.getMobile());
	 RegistrationService.updateRegistration(registration);
	 
	 List<Registration> registrations = RegistrationService.getRegistrations();
		model.addAttribute("registrations", registrations);
		return "all_registration";
	 
 }
 
 }
 

