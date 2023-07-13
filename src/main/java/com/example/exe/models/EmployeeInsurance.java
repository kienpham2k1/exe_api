package com.example.exe.models;

import com.example.exe.enums.EmployeeEnum;
import com.example.exe.enums.EmployeeInsuranceEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_insurance", schema = "dbo")
public class EmployeeInsurance {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id_employee", nullable = false, length = 100)
    private String idEmployee;
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id_insuarace", nullable = false, length = 100)
    private String idInsuarace;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;

    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private EmployeeInsuranceEnum status;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_employee", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Employee employeeByIdEmployee;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_insuarace", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Insurance insuranceByIdInsuarace;
}