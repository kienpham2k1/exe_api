package com.example.exe.DAO;

import com.example.exe.model.EmployeeEntity;
import com.example.exe.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDAO extends BaseDAOService<EmployeeEntity> {
@Autowired EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> GetAll() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity GetByID(String id) {
        return null;
    }

    @Override
    public EmployeeEntity Create(EmployeeEntity newEntity) {
        return null;
    }

    @Override
    public EmployeeEntity Update(String id, EmployeeEntity updateEntity) {
        return null;
    }

    @Override
    public void Delete(String id) {

    }
}
