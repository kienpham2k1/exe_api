package com.example.exe.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Employee_Insurance", schema = "dbo", catalog = "EXE")
@IdClass(EmployeeInsuranceEntityPK.class)
public class EmployeeInsuranceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_employee")
    private String idEmployee;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_insuarace")
    private String idInsuarace;

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdInsuarace() {
        return idInsuarace;
    }

    public void setIdInsuarace(String idInsuarace) {
        this.idInsuarace = idInsuarace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeInsuranceEntity that = (EmployeeInsuranceEntity) o;
        return Objects.equals(idEmployee, that.idEmployee) && Objects.equals(idInsuarace, that.idInsuarace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, idInsuarace);
    }
}
