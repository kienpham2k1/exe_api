package com.example.exe.service.serviceInterface;

import com.example.exe.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PositionService  {
        List<Position> getAll();
        Optional<Position> getById(String id);
        void create(Position newEntity);
        void update(String id, Position newEntity);
        void delete(String id);
}
