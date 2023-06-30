package com.example.exe.service.serviceImplement;

import com.example.exe.models.Level;
import com.example.exe.service.serviceInterface.LevelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LevelServiceImplement  implements LevelService {
    @Override
    public List<Level> getAll() {
        return null;
    }

    @Override
    public Optional<Level> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Level newEntity) {

    }

    @Override
    public void update(String id, Level newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
