package com.example.exe.service.serviceImplement;

import com.example.exe.models.Department;
import com.example.exe.models.Dependent;
import com.example.exe.repository.DepartmentRepository;
import com.example.exe.service.serviceInterface.DepartmentService;
import com.example.exe.service.serviceInterface.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImplement implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void create(Department newEntity) {
        departmentRepository.save(newEntity);
    }

    @Override
    public void update(String id, Department newEntity) {
        departmentRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
        departmentRepository.deleteById(id);
    }
}
