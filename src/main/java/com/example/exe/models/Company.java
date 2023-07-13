package com.example.exe.models;

import com.example.exe.enums.CompanyEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company",schema = "dbo")
public class Company {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = 100)
    private String description;
    @Basic
    @Column(name = "tax_code", nullable = true, length = 100)
    private String taxCode;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 100)
    private String phoneNumber;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.STRING)
    private CompanyEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private Collection<CompanySubscription> companySubscriptions;
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private Collection<Contact> contacts;
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private Collection<Department> departments;
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private Collection<User> users;
}