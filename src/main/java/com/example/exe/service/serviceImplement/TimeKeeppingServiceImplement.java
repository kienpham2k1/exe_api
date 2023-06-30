package com.example.exe.service.serviceImplement;

import com.example.exe.models.Timekeeping;
import com.example.exe.service.serviceInterface.TimeKeeppingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TimeKeeppingServiceImplement implements TimeKeeppingService {
    @Override
    public List<Timekeeping> getAll() {
        return null;
    }

    @Override
    public Optional<Timekeeping> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Timekeeping newEntity) {

    }

    @Override
    public void update(String id, Timekeeping newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
