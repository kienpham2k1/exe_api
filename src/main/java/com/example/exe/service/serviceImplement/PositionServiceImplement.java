package com.example.exe.service.serviceImplement;

import com.example.exe.models.Position;
import com.example.exe.service.serviceInterface.PositionService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PositionServiceImplement implements PositionService {
    @Override
    public List<Position> getAll() {
        return null;
    }

    @Override
    public Optional<Position> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Position newEntity) {

    }

    @Override
    public void update(String id, Position newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
