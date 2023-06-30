package com.example.exe.models;

import com.example.exe.enums.CompanyEnum;
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
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<CompanySubscription> companySubscriptionsById;
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<Contact> contactsById;
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<Department> departmentsById;
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<User> usersById;
}