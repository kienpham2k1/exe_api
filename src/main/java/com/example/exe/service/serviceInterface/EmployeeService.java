package com.example.exe.service.serviceInterface;

import com.example.exe.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAll();
    Optional<Employee> getById(String id);
    void create(Employee newEntity);
    void update(String id, Employee newEntity);
    void delete(String id);
}
