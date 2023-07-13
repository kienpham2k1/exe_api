package com.example.exe.controller;

import com.example.exe.models.SubscriptionPackage;
import com.example.exe.service.serviceInterface.SubscriptionPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/subcriptionPackage")
public class SubscriptionPackageController {
    @Autowired
    SubscriptionPackageService SubscriptionPackageService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(SubscriptionPackageService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(SubscriptionPackageService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody SubscriptionPackage newEntiy) {
        SubscriptionPackageService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody SubscriptionPackage newEntiy) {
        SubscriptionPackageService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        SubscriptionPackageService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
