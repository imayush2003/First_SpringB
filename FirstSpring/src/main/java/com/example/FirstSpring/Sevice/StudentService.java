package com.example.FirstSpring.Sevice;

import java.util.List;

import com.example.FirstSpring.Model.StudentDetails;

public interface StudentService {
	void saveStudent(StudentDetails studentDetails);
	List<StudentDetails> getAllStudents();
}
