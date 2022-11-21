package com.fortheadvancementoflearning.studentmanagementsystem.services;

import java.util.List;

import com.fortheadvancementoflearning.studentmanagementsystem.models.Student;




public interface StudentService {

		List<Student> getAllStudents();
		
		Student saveStudent(Student student);
		
		Student getStudentById(Long id);
		
		Student updateStudent(Student student);
		
		void deleteStudentById(Long id);
	}

