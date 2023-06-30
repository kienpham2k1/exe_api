package com.example.exe.payload.request;

import com.example.exe.enums.InsuranceEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
public class InsuranceRequest {
    private String code;
    private String description;
    private String name;
    private InsuranceEnum status = InsuranceEnum.WAITING;
    private Date timeBegin;
    private Date timeEnd;
}