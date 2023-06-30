package com.example.exe.service.serviceInterface;

import com.example.exe.models.Insurance;
import com.example.exe.models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InsuranceService  {
    List<Insurance> getAll();
    Optional<Insurance> getById(String id);
    void create(Insurance newEntity);
    void update(String id, Insurance newEntity);
    void delete(String id);
}
