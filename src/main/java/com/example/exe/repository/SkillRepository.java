package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, String> {
}
