package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, String> {
}
