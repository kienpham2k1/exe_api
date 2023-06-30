package com.example.exe.payload.request;

import com.example.exe.enums.DepartmentEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
public class DepartmentRequest {
    private String description;
    private String idCompany;
    private String name;
    private DepartmentEnum status = DepartmentEnum.WAITING;
}