package com.kd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kd.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
