package com.example.FirstSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpring.Model.StudentDetails;
import com.example.FirstSpring.Sevice.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	
	public String saveStudent(@RequestBody StudentDetails studentDetails) {
		studentService.saveStudent(studentDetails);
		return "Data Saved Successfully..!!";

	}
	@GetMapping("/getall")
	
	public List<StudentDetails> getAllStudents(){
		return studentService.getAllStudents();
	}
}
