package com.example.exe.controller;

import com.example.exe.models.Timekeeping;
import com.example.exe.models.User;
import com.example.exe.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody User newEntiy) {
        userService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody User newEntiy) {
        userService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
