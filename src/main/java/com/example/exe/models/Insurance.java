package com.example.exe.models;

import com.example.exe.enums.InsuranceEnum;
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
@Table(name = "insurance", schema = "dbo")
public class Insurance {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "code", nullable = true, length = 100)
    private String code;
    @Basic
    @Column(name = "description", nullable = true, length = 100)
    private String description;
    @Basic
    @Column(name = "time_begin", nullable = true)
    private Date timeBegin;
    @Basic
    @Column(name = "time_end", nullable = true)
    private Date timeEnd;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private InsuranceEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "insuranceByIdInsuarace")
    @JsonIgnore
    private Collection<EmployeeInsurance> employeeInsurancesById;
}