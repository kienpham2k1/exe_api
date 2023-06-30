package com.example.exe.payload.request;

import com.example.exe.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
public class RoleRequest {
    private String idCompany;
    private Boolean isDeleted;
    private String name;
    private RoleEnum status = RoleEnum.WAITING;
}