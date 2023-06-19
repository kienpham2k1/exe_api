package com.example.exe.DAO;

import com.example.exe.model.Employee;
import com.example.exe.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDAO extends BaseDAOService<Employee> {
@Autowired EmployeeRepository employeeRepository;
    @Override
    public List<Employee> GetAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee GetByID(String id) {
        return null;
    }

    @Override
    public Employee Create(Employee newEntity) {
        return null;
    }

    @Override
    public Employee Update(String id, Employee updateEntity) {
        return null;
    }

    @Override
    public void Delete(String id) {

    }
}
