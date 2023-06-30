package com.example.exe.controller;

import com.example.exe.models.Timekeeping;
import com.example.exe.service.serviceInterface.TimeKeeppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/timekeppings")
public class TimeKeeppingController {
    @Autowired
    TimeKeeppingService timeKeeppingService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(timeKeeppingService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(timeKeeppingService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Timekeeping newEntiy) {
        timeKeeppingService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Timekeeping newEntiy) {
        timeKeeppingService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
         timeKeeppingService.delete(id);return new ResponseEntity<>(HttpStatus.OK);
    }
}
