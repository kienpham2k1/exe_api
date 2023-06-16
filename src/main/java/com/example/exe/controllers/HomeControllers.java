package com.example.exe.controllers;

import com.example.exe.EmployeesRepository;
import com.example.exe.models.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeControllers {
//    @Autowired
//    EmployeesRepository employeesRepository;
    @GetMapping("/home")
    public String OnGet() {
        return  "Hello";
    }
}
