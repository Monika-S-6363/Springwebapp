package com.remainder.Springwebapp.service;

import com.remainder.Springwebapp.model.Student;
import com.remainder.Springwebapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Comparator;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public  String maxScore(){
        List<Student> students=studentRepository.findAll();
        Student user1 = students.stream()
                .min(Comparator.comparingInt(Student::getTotal))
                .get();
        System.out.println("Student with minimum score: " + user1.getName());
        Student user2 = students.stream()
                .max(Comparator.comparingInt(Student::getTotal))
                .get();

        System.out.println("Student with maximum score: " + user2.getName());
        Student user3 = students.stream()
                .max(Comparator.comparingInt(Student::getMath))
                .get();

        System.out.println("Student with maximum math score: " + user3.getName());
        //Student student= new Student();
        //return studentRepository.findById(student.getId()).get();
        return "maxscore";
    }
}
