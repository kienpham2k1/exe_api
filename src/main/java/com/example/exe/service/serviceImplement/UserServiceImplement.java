package com.example.exe.service.serviceImplement;

import com.example.exe.models.User;
import com.example.exe.repository.UserRepository;
import com.example.exe.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void create(User newEntity) {
        userRepository.save(newEntity);
    }

    @Override
    public void update(String id, User newEntity) {
    userRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
    }
}
