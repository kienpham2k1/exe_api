package com.example.exe.payload.request;

import com.example.exe.enums.CompanyEnum;
import com.example.exe.enums.EmployeeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
@Data
public class CompanyRequest {
    private String description;
    private String email;
    private String name;
    private String phoneNumber;
    private CompanyEnum status = CompanyEnum.WAITING;
    private String taxCoe;
}