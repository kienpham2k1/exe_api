package com.example.exe.controller;

import com.example.exe.models.Employee;
import com.example.exe.payload.EmployeeRequest;
import com.example.exe.repository.EmployeeRepository;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity onGet() {
        return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity onPost(@RequestBody EmployeeRequest employee2) {
        Employee employee = new Employee();
        employee.setName("ss");
        employeeService.create(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
