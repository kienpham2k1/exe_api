package com.example.exe.service.serviceImplement;

import com.example.exe.models.Insurance;
import com.example.exe.repository.DepartmentRepository;
import com.example.exe.repository.InsuranceRepository;
import com.example.exe.service.serviceInterface.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceServiceImplement implements InsuranceService {
    @Autowired
    InsuranceRepository insuranceRepository;

    @Override
    public List<Insurance> getAll() {
        return insuranceRepository.findAll();
        
    }

    @Override
    public Optional<Insurance> getById(String id) {
        return insuranceRepository.findById(id);
    }

    @Override
    public void create(Insurance newEntity) {
        insuranceRepository.save(newEntity);
    }

    @Override
    public void update(String id, Insurance newEntity) {
        insuranceRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
insuranceRepository.deleteById(id);
    }
}
