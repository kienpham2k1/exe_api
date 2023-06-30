package com.example.exe.repository;

import com.example.exe.models.Employee;
import com.example.exe.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
