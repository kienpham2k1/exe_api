package com.example.exe.service.serviceInterface;

import com.example.exe.DAO.BaseDAOService;
import com.example.exe.model.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> GetAll();
    EmployeeEntity GetById();
    EmployeeEntity Create(EmployeeEntity newEmployee);
    EmployeeEntity Update(String id, EmployeeEntity newEmployee);
    EmployeeEntity Delete(String id);
}
