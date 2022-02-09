package com.remainder.Springwebapp.controller;

import com.remainder.Springwebapp.model.Student;
import com.remainder.Springwebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }

    @GetMapping("/getAll")
   public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
