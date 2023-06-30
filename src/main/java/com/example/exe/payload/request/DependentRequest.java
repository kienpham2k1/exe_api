package com.example.exe.payload.request;

import com.example.exe.enums.DepartmentEnum;
import com.example.exe.enums.DependentEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
public class DependentRequest {
    private String idEmployee;
    private String name;
    private String relationDescription;
    private DependentEnum status = DependentEnum.WAITING;
}