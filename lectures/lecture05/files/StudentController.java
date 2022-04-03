package com.example.mvc_demo2.controllers;

import com.example.mvc_demo2.model.*;
import com.example.mvc_demo2.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.*;

@Controller
public class StudentController {

    private StudentService service;

    @Autowired
    public void setService(StudentService service) {
        this.service = service;
    }

    @PostMapping("/")
    public String processAddStudentForm(@Valid Student student, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("Validation has been failed!");
            return "add_student";
        }

        service.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Student> list = service.getAllStudents();
        model.addAttribute("students", list);

        return "index";
    }

    @GetMapping("/add_student")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "add_student";
    }
}
