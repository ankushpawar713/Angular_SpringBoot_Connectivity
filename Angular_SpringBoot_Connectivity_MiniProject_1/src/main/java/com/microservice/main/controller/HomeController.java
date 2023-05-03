package com.microservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.main.model.Enquirystudent;
import com.microservice.main.serviceIN.EnquiryService;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	EnquiryService enquiryService;
	
	@PostMapping("/enquiry")
	public Enquirystudent save(@RequestBody Enquirystudent enquirystudent) {
		
		return enquiryService.saveData(enquirystudent);
	}
	
	@GetMapping("/enquiry")
	public List<Enquirystudent> getAll(){
		
		return enquiryService.getAllData();
	}
	
	@DeleteMapping("/enquiry/{id}")
	public String deleteData(@PathVariable int id) {
		
	String msg=enquiryService.deleteData(id);
	return msg;
		
	}
	
	 
}
