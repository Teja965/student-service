package com.example.studentservice.repository;

import com.example.studentservice.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {

   static  Map<Long, Student> studentMap = new HashMap<>();

    static {
        Student s1 = new Student();
        s1.setId(10021L);
        s1.setName("Sachoin Tendulkar");
        s1.setPhonenumber("5185222351");

        Student s2 = new Student();
        s2.setId(10023L);
        s2.setName("Virat Kholi");
        s2.setPhonenumber("5185222351");

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
    }

    public Student getStudentById(Long id) {
        return studentMap.get(id);
    }
    public List<Student> getAllStudents(){
        return studentMap.values().stream().collect(Collectors.toList());

    }
}

