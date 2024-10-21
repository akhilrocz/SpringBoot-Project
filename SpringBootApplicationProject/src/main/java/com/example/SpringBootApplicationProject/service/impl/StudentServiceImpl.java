package com.example.SpringBootApplicationProject.service.impl;

import com.example.SpringBootApplicationProject.model.Student;
import com.example.SpringBootApplicationProject.repository.StudentRepository;
import com.example.SpringBootApplicationProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();    //returns records from the table
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "Deleted the record";
    }
}
