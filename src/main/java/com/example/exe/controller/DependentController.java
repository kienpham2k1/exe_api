package com.example.exe.controller;

import com.example.exe.models.Dependent;
import com.example.exe.service.serviceInterface.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/dependents")
public class DependentController {
    @Autowired
    DependentService dependentService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(dependentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(dependentService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Dependent newEntity) {
        dependentService.create(newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Dependent newEntity) {
        dependentService.update(id, newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        dependentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
