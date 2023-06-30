package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, String> {
}
