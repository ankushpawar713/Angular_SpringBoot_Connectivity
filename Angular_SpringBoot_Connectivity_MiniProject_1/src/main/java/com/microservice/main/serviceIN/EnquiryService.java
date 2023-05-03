package com.microservice.main.serviceIN;

import java.util.List;

import com.microservice.main.model.Enquirystudent;

public interface EnquiryService {

	public Enquirystudent saveData(Enquirystudent enquirystudent);

	public List<Enquirystudent> getAllData();

	public String deleteData(int id);

}
