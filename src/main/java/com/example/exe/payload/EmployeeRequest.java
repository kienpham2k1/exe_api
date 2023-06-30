package com.example.exe.payload;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private String name;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String idDepartment;
    private String idContact;
    private String idTimekeeping;
    private String idPosition;
    private String status;
}
