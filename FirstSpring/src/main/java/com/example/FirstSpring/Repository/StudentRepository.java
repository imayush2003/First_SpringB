package com.example.FirstSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstSpring.Model.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
