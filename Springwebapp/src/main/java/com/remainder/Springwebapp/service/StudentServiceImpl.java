package com.remainder.Springwebapp.service;

import com.remainder.Springwebapp.model.Student;
import com.remainder.Springwebapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}
