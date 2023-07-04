package com.example.exe.service.serviceImplement;

import com.example.exe.models.Role;
import com.example.exe.models.Role;
import com.example.exe.repository.RoleRepository;
import com.example.exe.service.serviceInterface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImplement implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> getById(String id) {
        return roleRepository.findById(id);
    }

    @Override
    public void create(Role newEntity) {
        roleRepository.save(newEntity);
    }

    @Override
    public void update(String id, Role newEntity) {
        roleRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {

    }
}
