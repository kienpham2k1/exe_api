package com.example.exe.service.serviceInterface;

import com.example.exe.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SkillService {
        List<Skill> getAll();
        Optional<Skill> getById(String id);
        void create(Skill newEntity);
        void update(String id, Skill newEntity);
        void delete(String id);
}
