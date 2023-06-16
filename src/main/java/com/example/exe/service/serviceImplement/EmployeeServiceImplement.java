package com.example.exe.service.serviceImplement;

import com.example.exe.DAO.EmployeeDAO;
import com.example.exe.model.EmployeeEntity;
import com.example.exe.repository.EmployeeRepository;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<EmployeeEntity> GetAll() {
        return  employeeDAO.GetAll();
    }

    @Override
    public EmployeeEntity GetById() {
        return null;
    }

    @Override
    public EmployeeEntity Create(EmployeeEntity newEmployee) {
        return null;
    }

    @Override
    public EmployeeEntity Update(String id, EmployeeEntity newEmployee) {
        return null;
    }

    @Override
    public EmployeeEntity Delete(String id) {
        return null;
    }
}
