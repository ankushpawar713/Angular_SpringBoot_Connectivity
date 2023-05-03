package com.microservice.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String firstname;
	String lastname;
	String education;
	int passingyear;
	long mobileno;
	String course;
	String batch;
	double feepaid;
	@OneToOne(cascade = CascadeType.ALL)
	PlacementDeatils placementDeatils;
	
		
	public PlacementDeatils getPlacementDeatils() {
		return placementDeatils;
	}
	public void setPlacementDeatils(PlacementDeatils placementDeatils) {
		this.placementDeatils = placementDeatils;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public double getFeepaid() {
		return feepaid;
	}
	public void setFeepaid(double feepaid) {
		this.feepaid = feepaid;
	}
	
	
	
	
}
