package com.rahul.Student_Management_System.service;

import java.util.List;

import com.rahul.Student_Management_System.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	 
	void deleteStudentById(Long id);
}