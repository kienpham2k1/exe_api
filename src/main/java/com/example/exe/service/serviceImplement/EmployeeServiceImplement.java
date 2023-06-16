package com.example.exe.service.serviceImplement;

import com.example.exe.model.EmployeeEntity;
import com.example.exe.repository.EmployeeRepository;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> GetAll() {
        return  employeeRepository.findAll();
    }
}
