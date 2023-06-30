package com.example.exe.controller;

import com.example.exe.models.Contact;
import com.example.exe.service.serviceInterface.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(contactService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(contactService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Contact newEntity) {
        contactService.create(newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Contact newEntity) {
        contactService.update(id, newEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        contactService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
