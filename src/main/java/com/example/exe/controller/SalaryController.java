package com.example.exe.controller;

import com.example.exe.models.Salary;
import com.example.exe.service.serviceInterface.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/salaries")
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(salaryService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(salaryService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Salary newEntiy) {
        salaryService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Salary newEntiy) {
        salaryService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        salaryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
