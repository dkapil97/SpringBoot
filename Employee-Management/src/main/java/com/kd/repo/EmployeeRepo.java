package com.kd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kd.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	 @Query("select e from Employee e where e.empFirstName=:n")
	 List<Employee> findByEmpFirstName(@Param("n") String empFirstName);
	 
	 @Query("select e From Employee e")
	 List<Employee> findByAllEmployee();
}
