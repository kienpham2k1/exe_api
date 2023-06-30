package com.example.exe.controller;

import com.example.exe.models.Salary;
import com.example.exe.models.Skill;
import com.example.exe.service.serviceInterface.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping
    public ResponseEntity<?> onGet() {
        return new ResponseEntity<>(skillService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> onGet(@RequestParam String id) {
        return new ResponseEntity<>(skillService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> onPost(@RequestBody Skill newEntiy) {
        skillService.create(newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> onPut(@RequestParam String id, @RequestBody Skill newEntiy) {
        skillService.update(id, newEntiy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> onDelete(@RequestParam String id) {
        skillService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
