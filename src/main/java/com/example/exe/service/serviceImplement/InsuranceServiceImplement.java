package com.example.exe.service.serviceImplement;

import com.example.exe.models.Insurance;
import com.example.exe.service.serviceInterface.InsuranceService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InsuranceServiceImplement  implements InsuranceService {
    @Override
    public List<Insurance> getAll() {
        return null;
    }

    @Override
    public Optional<Insurance> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Insurance newEntity) {

    }

    @Override
    public void update(String id, Insurance newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
