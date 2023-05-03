package com.microservice.main.serviceIN;

import java.util.List;

import com.microservice.main.model.Enquirystudent;
import com.microservice.main.model.Student;

public interface StudentServiceIN {

public	Student saveData(Student student);

public	List<Student> getData();

public	String deleteData(int id);

public  Student updateData(int id, Student student);

}
