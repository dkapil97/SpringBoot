package com.kd.service;

import java.util.List;

import com.kd.model.Student;

public interface StudentService {

	Student saveStudent(Student student);
	Student getStudent(Long id);
	Student updateStudent(Long id,Student student);
	List<Student> getAllSudent();
	void deleteStudent(Long id);
}
