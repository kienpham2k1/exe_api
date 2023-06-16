package com.example.exe.controller;

import com.example.exe.model.EmployeeEntity;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeControllers {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/home")
    public List<EmployeeEntity> OnGet() {
      return   employeeService.GetAll();
    }
}
