package com.microservice.main.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.main.model.Student;
import com.microservice.main.repository.StudentRepository;
import com.microservice.main.serviceIN.StudentServiceIN;
@Service
public class StudentServiceIMPL implements StudentServiceIN {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student saveData(Student student) {
		 
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getData() {
		return studentRepository.findAll();
	}

	@Override
	public String deleteData(int id) {
		Optional<Student> findById = studentRepository.findById(id);
		if(findById.isPresent()) {
			studentRepository.deleteById(findById.get().getId());
			return "Data Delete";
		}else {
			return "Data Not Present";
		}
		 
	}

	@Override
	public Student updateData(int id, Student student) {
		Optional<Student> findById = studentRepository.findById(id);
		if(findById.isPresent()) {
			student.setId(findById.get().getId());
			return studentRepository.save(student);
		}
		 else {
			return new Student();
		}
	}

}
