package com.example.exe.repository;

import com.example.exe.models.Timekeeping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeKeeppingRepository extends JpaRepository<Timekeeping, String> {
}
