package com.microservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.main.model.Enquirystudent;

public interface EnquiryRepository extends JpaRepository<Enquirystudent, Integer> {

}
