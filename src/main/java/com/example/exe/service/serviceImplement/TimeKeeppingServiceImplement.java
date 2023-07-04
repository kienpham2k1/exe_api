package com.example.exe.service.serviceImplement;

import com.example.exe.models.Timekeeping;
import com.example.exe.repository.TimeKeeppingRepository;
import com.example.exe.service.serviceInterface.TimeKeeppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TimeKeeppingServiceImplement implements TimeKeeppingService {
    @Autowired
    TimeKeeppingRepository timeKeeppingRepository;
    @Override
    public List<Timekeeping> getAll() {
        return timeKeeppingRepository.findAll();
    }

    @Override
    public Optional<Timekeeping> getById(String id) {
        return timeKeeppingRepository.findById(id);
    }

    @Override
    public void create(Timekeeping newEntity) {
        timeKeeppingRepository.save(newEntity);
    }

    @Override
    public void update(String id, Timekeeping newEntity) {
        timeKeeppingRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {

    }
}
