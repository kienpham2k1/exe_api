package com.example.exe.service.serviceInterface;

import com.example.exe.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SalaryService {
    List<Salary> getAll();

    Optional<Salary> getById(String id);

    void create(Salary newEntity);

    void update(String id, Salary newEntity);

    void delete(String id);
}
