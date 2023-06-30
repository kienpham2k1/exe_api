package com.example.exe.controller;

import com.example.exe.models.Level;
import com.example.exe.service.serviceInterface.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/levels")
public class LevelController {
    @Autowired
    LevelService levelService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(levelService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(levelService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Level newEntiy) {
        levelService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Level newEntiy) {
        levelService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        levelService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
