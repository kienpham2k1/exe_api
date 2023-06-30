package com.example.exe.models;

import com.example.exe.enums.CompanySubscriptionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company_Subscription", schema = "dbo")
public class CompanySubscription {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id_company", nullable = false, length = 100)
    private String idCompany;
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id_subscription_pakage", nullable = false, length = 100)
    private String idSubscriptionPakage;
    @Basic
    @Column(name = "time_begin", nullable = true)
    private Date timeBegin;
    @Basic
    @Column(name = "time_end", nullable = true)
    private Date timeEnd;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private CompanySubscriptionEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Company companyByIdCompany;
    @ManyToOne
    @JoinColumn(name = "id_subscription_pakage", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private SubscriptionPackage subscriptionPackageByIdSubscriptionPakage;
}