package com.microservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.main.model.Student;
 
import com.microservice.main.serviceIN.StudentServiceIN;
@CrossOrigin("*")
@RestController
public class StudentController {
	@Autowired
	 StudentServiceIN studentServiceIN;
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		
		return  studentServiceIN.saveData(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAll(){
		
		return  studentServiceIN.getData();
	}
	@PutMapping("/student/{id}")
	public Student updatedata(@PathVariable int id,@RequestBody Student student){
		
		return    studentServiceIN.updateData(id,student);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteData(@PathVariable int id) {
		
	String msg= studentServiceIN.deleteData(id);
	return msg;
		
	}
	
}
