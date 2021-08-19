package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.templates.StudentTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @GetMapping("student")
    public String getStudent()
    {
        Student student = new Student();
        student.setName("John");
        student.setGender("Male");
        student.setAge(12);
        return StudentTemplate.template(student)
                .render()
                .toString();
    }
}
