package com.example.exe.service.serviceInterface;

import com.example.exe.models.Level;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LevelService  {
        List<Level> getAll();
        Optional<Level> getById(String id);
        void create(Level newEntity);
        void update(String id, Level newEntity);
        void delete(String id);
}
