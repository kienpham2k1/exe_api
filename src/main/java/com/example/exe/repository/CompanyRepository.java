package com.example.exe.repository;

import com.example.exe.models.Company;
import com.example.exe.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
