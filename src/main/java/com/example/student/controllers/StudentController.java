package com.example.student.controllers;

import com.example.student.models.Student;
import com.example.student.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    StudentServices stu;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return stu.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return stu.getStudentById(id);
    }

    @PostMapping
    public String addStudents(@RequestBody Student student){
         return stu.addStudents(student);
    }

    @PutMapping("/students/{id}")
    public String updateStudents(@PathVariable int id,@RequestBody Student student){
        return stu.updateStudents(id,student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        return stu.deleteStudents(id);
    }
}