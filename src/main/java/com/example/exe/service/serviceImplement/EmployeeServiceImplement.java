package com.example.exe.service.serviceImplement;

import com.example.exe.DAO.EmployeeDAO;
import com.example.exe.model.Employee;
import com.example.exe.service.serviceInterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<Employee> GetAll() {
        return  employeeDAO.GetAll();
    }

    @Override
    public Employee GetById() {
        return null;
    }

    @Override
    public Employee Create(Employee newEmployee) {
        return null;
    }

    @Override
    public Employee Update(String id, Employee newEmployee) {
        return null;
    }

    @Override
    public Employee Delete(String id) {
        return null;
    }
}
