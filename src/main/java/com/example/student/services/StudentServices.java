package com.example.student.services;

import com.example.student.models.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServices {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudents(Student stu){
        studentRepository.save(stu);
        return "Student added successfully";
    }


    public List<Student> getAllStudents() {
    return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public String updateStudents(int id, Student student) {
        studentRepository.save(student);
        return "Student added successfully";
    }

    public String deleteStudents(int id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
}