package com.example.exe.payload.request;

import com.example.exe.enums.CompanySubscriptionEnum;
import com.example.exe.models.CompanySubscription;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;
@Data
public class CompanySubscriptionRequest {
    private String idSubscriptionPakage;
    private String idCompany;
    private CompanySubscriptionEnum status = CompanySubscriptionEnum.WAITING;
    private Date timeBegin;
    private Date timeEnd;
}