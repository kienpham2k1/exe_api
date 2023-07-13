package com.example.exe.service.serviceImplement;

import com.example.exe.models.Position;
import com.example.exe.repository.PositionRepository;
import com.example.exe.service.serviceInterface.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImplement implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> getAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<Position> getById(String id) {
        return positionRepository.findById(id);
    }

    @Override
    public void create(Position newEntity) {
        positionRepository.save(newEntity);
    }

    @Override
    public void update(String id, Position newEntity) {
        positionRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
        positionRepository.deleteById(id);
    }
}
