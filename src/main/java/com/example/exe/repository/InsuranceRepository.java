package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, String> {
}
