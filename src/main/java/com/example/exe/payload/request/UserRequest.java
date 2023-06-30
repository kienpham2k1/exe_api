package com.example.exe.payload.request;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
public class UserRequest {
    private String idCompany;
    private String idRole;
    private String name;
    private String status;
}