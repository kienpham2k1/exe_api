package com.example.exe.repository;

import com.example.exe.models.Dependent;
import com.example.exe.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentRepository extends JpaRepository<Dependent, String> {
}
