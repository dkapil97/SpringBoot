package com.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kd.model.Student;
import com.kd.repository.StudentRepo;

public class StudentServiceImple implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllSudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub

	}

}
