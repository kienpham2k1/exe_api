package com.example.exe.service.serviceImplement;

import com.example.exe.models.Dependent;
import com.example.exe.service.serviceInterface.DependentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DependentServiceImplement implements DependentService {
    @Override
    public List<Dependent> getAll() {
        return null;
    }

    @Override
    public Optional<Dependent> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Dependent newEntity) {

    }

    @Override
    public void update(String id, Dependent newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
