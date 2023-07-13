package com.example.exe.controller;

import com.example.exe.models.Employee;
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
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(employeeService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Employee newEntity) {
        employeeService.create(newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Employee newEntity) {
        employeeService.update(id, newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        employeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
