package com.kd.service;

import java.util.List;

import com.kd.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Long empId, Employee employee);
	
	public Employee getEmployee(Long empId);
	
	public List<Employee> getAllEmployees();
	
	public void deleteEmployee(Long empId);
	
	public List<Employee> getEmployeeByName(String empFirstName);
}
