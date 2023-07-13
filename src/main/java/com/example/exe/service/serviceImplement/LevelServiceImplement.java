package com.example.exe.service.serviceImplement;

import com.example.exe.models.Level;
import com.example.exe.repository.LevelRepository;
import com.example.exe.service.serviceInterface.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LevelServiceImplement  implements LevelService {
    @Autowired
    LevelRepository levelRepository;
    @Override
    public List<Level> getAll() {
        return levelRepository.findAll();
    }

    @Override
    public Optional<Level> getById(String id) {
        return levelRepository.findById(id);
    }

    @Override
    public void create(Level newEntity) {
        levelRepository.save(newEntity);
    }

    @Override
    public void update(String id, Level newEntity) {
        levelRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
    levelRepository.deleteById(id);
    }
}
