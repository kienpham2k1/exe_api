package com.example.exe.service.serviceImplement;

import com.example.exe.models.Employee;
import com.example.exe.repository.EmployeeRepository;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        return  employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getById(String id) {
        return  employeeRepository.findById(id);
    }

    @Override
    public void create(Employee newEmployee) {
        employeeRepository.save(newEmployee);
    }

    @Override
    public void update(String id, Employee newEmployee) {

    }

    @Override
    public void delete(String id) {

    }
}
