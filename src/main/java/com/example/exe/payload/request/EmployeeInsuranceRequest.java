package com.example.exe.payload.request;

import com.example.exe.enums.EmployeeInsuranceEnum;
import com.example.exe.models.EmployeeInsurance;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
public class EmployeeInsuranceRequest {
    private String idInsuarace;
    private String idEmployee;
    private EmployeeInsuranceEnum status = EmployeeInsuranceEnum.WAITING;
}