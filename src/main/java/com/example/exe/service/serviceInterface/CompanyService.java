package com.example.exe.service.serviceInterface;

import com.example.exe.models.Company;
import com.example.exe.models.Employee;
import com.example.exe.payload.request.CompanyRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> getAll();
    Optional<Company> getById(String id);
    void create(Company newEntity);
    void update(String id, Company newEntity);
    void delete(String id);
}
