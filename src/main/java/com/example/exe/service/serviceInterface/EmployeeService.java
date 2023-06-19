package com.example.exe.service.serviceInterface;

import com.example.exe.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> GetAll();
    Employee GetById();
    Employee Create(Employee newEmployee);
    Employee Update(String id, Employee newEmployee);
    Employee Delete(String id);
}
