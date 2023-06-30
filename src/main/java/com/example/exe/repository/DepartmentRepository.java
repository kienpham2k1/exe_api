package com.example.exe.repository;

import com.example.exe.models.Department;
import com.example.exe.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
