package com.example.FirstSpring.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpring.Model.EmployeeDetails;
import com.example.FirstSpring.Repository.EmployeeRepository;
import com.example.FirstSpring.Sevice.EmployeeService;


@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(EmployeeDetails employeeDetails) {
		employeeRepository.save(employeeDetails);
	}

	@Override
	public List<EmployeeDetails> getallEmployee() {
		
		return employeeRepository.findAll();
	}
		@Override
		public void deleteEmployee(Integer id) {
			employeeRepository.deleteById(id);
			
		}

		@Override
		public EmployeeDetails getEmployeebyId(Integer id) {
			return employeeRepository.findById(id).get();
		}
	
}