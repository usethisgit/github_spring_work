package com.upen.springJdbcEx.service;

import com.upen.springJdbcEx.StudentRepo.StudentRepo;
import com.upen.springJdbcEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudents(){
       return studentRepo.findAll();

    }
}
