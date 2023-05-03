package com.microservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.main.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
