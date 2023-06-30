package com.example.exe.payload.request;

import com.example.exe.enums.CompanyEnum;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JGlobalMap
public class CompanyRequest {
    private String description;
    private String email;

    private String name;

    private String phoneNumber;

    private String taxCode;
    private CompanyEnum status = CompanyEnum.WAITING;
}