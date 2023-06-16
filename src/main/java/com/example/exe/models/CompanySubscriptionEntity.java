package com.example.exe.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Company_Subscription", schema = "dbo", catalog = "EXE")
@IdClass(CompanySubscriptionEntityPK.class)
public class CompanySubscriptionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_company")
    private String idCompany;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_subscription_pakage")
    private String idSubscriptionPakage;
    @Basic
    @Column(name = "time_begin")
    private Date timeBegin;
    @Basic
    @Column(name = "time_end")
    private Date timeEnd;
    @Basic
    @Column(name = "status")
    private String status;

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

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanySubscriptionEntity that = (CompanySubscriptionEntity) o;
        return Objects.equals(idCompany, that.idCompany) && Objects.equals(idSubscriptionPakage, that.idSubscriptionPakage) && Objects.equals(timeBegin, that.timeBegin) && Objects.equals(timeEnd, that.timeEnd) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompany, idSubscriptionPakage, timeBegin, timeEnd, status);
    }
}
