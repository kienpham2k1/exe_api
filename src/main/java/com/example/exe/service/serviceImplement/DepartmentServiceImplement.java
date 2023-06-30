package com.example.exe.service.serviceImplement;

import com.example.exe.models.Department;
import com.example.exe.models.Dependent;
import com.example.exe.service.serviceInterface.DepartmentService;
import com.example.exe.service.serviceInterface.DependentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentServiceImplement implements DepartmentService {
    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public Optional<Department> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Department newEntity) {

    }

    @Override
    public void update(String id, Department newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
