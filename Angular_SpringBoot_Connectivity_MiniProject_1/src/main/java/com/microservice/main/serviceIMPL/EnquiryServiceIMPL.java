package com.microservice.main.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.main.model.Enquirystudent;
import com.microservice.main.repository.EnquiryRepository;
import com.microservice.main.serviceIN.EnquiryService;
@Service
public class EnquiryServiceIMPL implements EnquiryService {

	@Autowired
	EnquiryRepository enquiryRepository;
	
	
	@Override
	public Enquirystudent saveData(Enquirystudent enquirystudent) {
		 
		return enquiryRepository.save(enquirystudent);
	}


	@Override
	public List<Enquirystudent> getAllData() {
		 
		return enquiryRepository.findAll();
	}


	@Override
	public String deleteData(int id) {
		 Optional<Enquirystudent> findById = enquiryRepository.findById(id);
		 
		if(findById.isPresent()) {
			
			enquiryRepository.deleteById(findById.get().getId());
			return "Delete Data";
		}
		else {
			return "Not Present ";
		}
		 
	}

}
