package com.example.exe.payload.request;

import com.example.exe.enums.ContactEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Data
public class ContactRequest {
    private Double baseSalary;
    private String description;
    private String idCompany;
    private String idEmployee;
    private String idLevel;
    private String idPosition;
    private String idSkill;
    private String name;
    private ContactEnum status = ContactEnum.WAITING;
    private Date timeBegin;
    private Date timeEnd;
}