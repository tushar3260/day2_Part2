package org.example.day2_restcontroller.controller;

import org.example.day2_restcontroller.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class home {
    @GetMapping("/")
    public List<StudentModel> getStudents() {

        List<StudentModel> students = new ArrayList<>();

        students.add(new StudentModel(1, "Tushar", "tushar@gmail.com"));
        students.add(new StudentModel(2, "Rahul", "rahul@gmail.com"));
        students.add(new StudentModel(3, "Aman", "aman@gmail.com"));
        students.add(new StudentModel(4, "Neha", "neha@gmail.com"));
        students.add(new StudentModel(5, "Pooja", "pooja@gmail.com"));

        return students;
    }

}
