package com.example.exe.service.serviceImplement;

import com.example.exe.models.Dependent;
import com.example.exe.repository.DependentRepository;
import com.example.exe.service.serviceInterface.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependentServiceImplement implements DependentService {
    @Autowired
    DependentRepository dependentRepository;

    @Override
    public List<Dependent> getAll() {
        return dependentRepository.findAll();
    }

    @Override
    public Optional<Dependent> getById(String id) {
        return dependentRepository.findById(id);
    }

    @Override
    public void create(Dependent newEntity) {
        dependentRepository.save(newEntity);
    }

    @Override
    public void update(String id, Dependent newEntity) {
        dependentRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {

    }
}
