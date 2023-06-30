package com.example.exe.payload.request;

import com.example.exe.enums.SalaryEnum;
import com.example.exe.models.Salary;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;
@Data
public class SalaryRequest {
    private Double gross;
    private String idContact;
    private String idEmployee;
    private String idTimekeeping;
    private Boolean isDeleted;
    private Double net;
    private SalaryEnum status = SalaryEnum.WAITING;
    private Date timeBegin;
    private Date timeEnd;
}