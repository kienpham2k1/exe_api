package com.example.exe.payload.request;

import com.example.exe.enums.EmployeeEnum;
import com.example.exe.models.Employee;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
public class EmployeeRequest {
    private Date dateOfBirth;
    private String email;
    private String idContact;
    private String idDepartment;
    private String idPosition;
    private String idTimekeeping;
    private String name;
    private String phoneNumber;
    private EmployeeEnum status = EmployeeEnum.WAITING;
}