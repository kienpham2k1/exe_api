package com.example.exe.service.serviceInterface;

import com.example.exe.models.Employee;
import com.example.exe.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleService  {
    List<Role> getAll();
    Optional<Role> getById(String id);
    void create(Role newEntity);
    void update(String id, Role newEntity);
    void delete(String id);}
