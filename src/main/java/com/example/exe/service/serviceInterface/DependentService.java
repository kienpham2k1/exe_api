package com.example.exe.service.serviceInterface;

import com.example.exe.models.Department;
import com.example.exe.models.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DependentService   {
    List<Dependent> getAll();
    Optional<Dependent> getById(String id);
    void create(Dependent newEntity);
    void update(String id, Dependent newEntity);
    void delete(String id);
}
