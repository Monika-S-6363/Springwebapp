package com.remainder.Springwebapp.service;

import com.remainder.Springwebapp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public String maxScore();
}
