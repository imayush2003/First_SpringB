package com.example.FirstSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstSpring.Model.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
