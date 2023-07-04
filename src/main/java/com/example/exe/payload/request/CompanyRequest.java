package com.example.exe.payload.request;

import com.example.exe.enums.CompanyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest {
    private String description;
    private String email;

    private String name;

    private String phoneNumber;

    private String taxCode;
    private CompanyEnum status = CompanyEnum.WAITING;
}