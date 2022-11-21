package com.fortheadvancementoflearning.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fortheadvancementoflearning.studentmanagementsystem.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
