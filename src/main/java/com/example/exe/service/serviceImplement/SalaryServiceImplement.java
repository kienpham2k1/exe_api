package com.example.exe.service.serviceImplement;

import com.example.exe.models.Salary;
import com.example.exe.service.serviceInterface.SalaryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SalaryServiceImplement implements SalaryService {
    @Override
    public List<Salary> getAll() {
        return null;
    }

    @Override
    public Optional<Salary> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Salary newEntity) {

    }

    @Override
    public void update(String id, Salary newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
