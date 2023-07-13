package com.example.exe.service.serviceInterface;

import com.example.exe.models.Timekeeping;
import com.example.exe.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    Optional<User> getById(String id);
    void create(User newEntity);
    void update(String id, User newEntity);
    void delete(String id);
}
