package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, String> {
}
