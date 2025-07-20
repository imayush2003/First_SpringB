package com.example.FirstSpring.Sevice;

import java.util.List;

import com.example.FirstSpring.Model.EmployeeDetails;

public interface EmployeeService {

	void saveEmployee(EmployeeDetails employeeDetails);
	List<EmployeeDetails> getallEmployee();
	void deleteEmployee(Integer id);
	EmployeeDetails getEmployeebyId(Integer id);
	
}