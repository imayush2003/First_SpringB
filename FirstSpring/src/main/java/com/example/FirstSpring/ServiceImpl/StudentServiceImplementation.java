package com.example.FirstSpring.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpring.Model.StudentDetails;
import com.example.FirstSpring.Repository.StudentRepository;
import com.example.FirstSpring.Sevice.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	@Override
	public void saveStudent(StudentDetails studentDetails) {
		studentRepository.save(studentDetails);
		
	}
@Override
	public List<StudentDetails> getAllStudents() {
		return studentRepository.findAll();
}
@Override
public void deleteStudent(Integer id) {
	studentRepository.deleteById(id);
	}


@Override
public StudentDetails getStudentbyId(Integer id) {
	return studentRepository.findById(id).get();
}

}
