package com.example.exe.payload.request;

import com.example.exe.enums.SubscriptionPackageEnum;
import com.example.exe.models.SubscriptionPackage;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
public class SubscriptionPackageRequest {
    private String description;
    private Boolean isDeleted;
    private String name;
    private String numberOfUser;
    private Double price;
    private SubscriptionPackageEnum status =SubscriptionPackageEnum.WAITING;
}