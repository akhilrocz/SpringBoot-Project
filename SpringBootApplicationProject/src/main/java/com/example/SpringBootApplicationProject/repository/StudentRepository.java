package com.example.SpringBootApplicationProject.repository;

import com.example.SpringBootApplicationProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
