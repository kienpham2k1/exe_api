package com.example.exe.service.serviceInterface;

import com.example.exe.models.Timekeeping;

import java.util.List;
import java.util.Optional;

public interface TimeKeeppingService {
    List<Timekeeping> getAll();
    Optional<Timekeeping> getById(String id);
    void create(Timekeeping newEntity);
    void update(String id, Timekeeping newEntity);
    void delete(String id);
}
