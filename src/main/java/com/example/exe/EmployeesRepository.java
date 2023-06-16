package com.example.exe;

import com.example.exe.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<EmployeeEntity, String>{
//    List<EmployeeEntity> GetAll => find;
}
