package com.example.exe.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class CompanySubscriptionEntityPK implements Serializable {
    @Column(name = "id_company")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idCompany;
    @Column(name = "id_subscription_pakage")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idSubscriptionPakage;

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public String getIdSubscriptionPakage() {
        return idSubscriptionPakage;
    }

    public void setIdSubscriptionPakage(String idSubscriptionPakage) {
        this.idSubscriptionPakage = idSubscriptionPakage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanySubscriptionEntityPK that = (CompanySubscriptionEntityPK) o;
        return Objects.equals(idCompany, that.idCompany) && Objects.equals(idSubscriptionPakage, that.idSubscriptionPakage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompany, idSubscriptionPakage);
    }
}
