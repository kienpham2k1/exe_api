package com.example.exe.service.serviceImplement;

import com.example.exe.models.Skill;
import com.example.exe.service.serviceInterface.SkillService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SkillServiceImplement implements SkillService {
    @Override
    public List<Skill> getAll() {
        return null;
    }

    @Override
    public Optional<Skill> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Skill newEntity) {

    }

    @Override
    public void update(String id, Skill newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
