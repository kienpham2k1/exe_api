package com.example.exe.controller;

import com.example.exe.models.Insurance;
import com.example.exe.service.serviceInterface.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/insurances")
public class InsuranceController {
    @Autowired
    InsuranceService insuranceService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(insuranceService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(insuranceService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Insurance newEntity) {
        insuranceService.create(newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Insurance newEntity) {
        insuranceService.update(id, newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        insuranceService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
