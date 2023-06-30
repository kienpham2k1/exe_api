package com.example.exe.controller;

import com.example.exe.models.Level;
import com.example.exe.models.Position;
import com.example.exe.service.serviceInterface.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/positions")
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(positionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(positionService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Position newEntiy) {
        positionService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Position newEntiy) {
        positionService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        positionService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
