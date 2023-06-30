package com.example.exe.service.serviceImplement;

import com.example.exe.models.Role;
import com.example.exe.models.Role;
import com.example.exe.service.serviceInterface.RoleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImplement implements RoleService {
    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Optional<Role> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void create(Role newEntity) {

    }

    @Override
    public void update(String id, Role newEntity) {

    }

    @Override
    public void delete(String id) {

    }
}
