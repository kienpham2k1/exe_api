package com.example.exe.models;

import com.example.exe.enums.EmployeeEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Collection;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee", schema = "dbo")
public class Employee {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 100)
    private String phoneNumber;
    @Basic
    @Column(name = "date_of_birth", nullable = true)
    private Date dateOfBirth;
    @Basic
    @Column(name = "id_department", nullable = true, length = 100)
    private String idDepartment;
    @Basic
    @Column(name = "id_contact", nullable = true, length = 100)
    private String idContact;
    @Basic
    @Column(name = "id_timekeeping", nullable = true, length = 100)
    private String idTimekeeping;
    @Basic
    @Column(name = "id_position", nullable = true, length = 100)
    private String idPosition;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private EmployeeEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "employeeByIdEmployee")
    @JsonIgnore
    private Collection<Contact> contactsById;
    @OneToMany(mappedBy = "employeeByIdEmployee")
    @JsonIgnore
    private Collection<Dependent> dependentsById;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_department", referencedColumnName = "id", insertable = false, updatable = false)
    private Department departmentByIdDepartment;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_timekeeping", referencedColumnName = "id", insertable = false, updatable = false)
    private Timekeeping timekeepingByIdTimekeeping;
    @OneToMany(mappedBy = "employeeByIdEmployee")
    @JsonIgnore
    private Collection<EmployeeInsurance> employeeInsurancesById;
    @OneToMany(mappedBy = "employeeByIdEmployee")
    @JsonIgnore
    private Collection<Salary> salariesById;
}