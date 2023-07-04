package com.example.exe.service.serviceImplement;

import com.example.exe.models.Salary;
import com.example.exe.repository.SalaryRepository;
import com.example.exe.service.serviceInterface.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SalaryServiceImplement implements SalaryService {
    @Autowired
    SalaryRepository salaryRepository;
    @Override
    public List<Salary> getAll() {
        return salaryRepository.findAll();
    }

    @Override
    public Optional<Salary> getById(String id) {
        return salaryRepository.findById(id);
    }

    @Override
    public void create(Salary newEntity) {
        salaryRepository.save(newEntity);
    }

    @Override
    public void update(String id, Salary newEntity) {
        salaryRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {

    }
}
