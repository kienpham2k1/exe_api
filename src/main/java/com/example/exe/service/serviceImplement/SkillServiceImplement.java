package com.example.exe.service.serviceImplement;

import com.example.exe.models.Skill;
import com.example.exe.repository.SkillRepository;
import com.example.exe.service.serviceInterface.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SkillServiceImplement implements SkillService {
    @Autowired
    SkillRepository skillRepository;
    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }

    @Override
    public Optional<Skill> getById(String id) {
        return skillRepository.findById(id);
    }

    @Override
    public void create(Skill newEntity) {
        skillRepository.save(newEntity);
    }

    @Override
    public void update(String id, Skill newEntity) {
        skillRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {

    }
}
