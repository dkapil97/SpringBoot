package com.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kd.entity.Employee;
import com.kd.repo.EmployeeRepo;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Long empId, Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = employeeRepo.findById(empId).get();
		employee2.setEmpFirstName(employee.getEmpFirstName());
		employee2.setEmpLastName(employee.getEmpLastName());

		Employee employee3 = employeeRepo.save(employee2);
		return employee3;
	}

	@Override
	public Employee getEmployee(Long empId) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(empId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findByAllEmployee();
	}

	@Override
	public void deleteEmployee(Long empId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(empId);
	}

	@Override
	public List<Employee> getEmployeeByName(String empFirstName) {
		// TODO Auto-generated method stub
		return employeeRepo.findByEmpFirstName(empFirstName);
	}

}
