package com.example.exe.service.serviceInterface;

import com.example.exe.models.Contact;
import com.example.exe.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentService  {
    List<Department> getAll();
    Optional<Department> getById(String id);
    void create(Department newEntity);
    void update(String id, Department newEntity);
    void delete(String id);
}
