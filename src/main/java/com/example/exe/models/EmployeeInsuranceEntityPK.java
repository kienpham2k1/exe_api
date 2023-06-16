package com.example.exe.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeInsuranceEntityPK implements Serializable {
    @Column(name = "id_employee")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idEmployee;
    @Column(name = "id_insuarace")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        EmployeeInsuranceEntityPK that = (EmployeeInsuranceEntityPK) o;
        return Objects.equals(idEmployee, that.idEmployee) && Objects.equals(idInsuarace, that.idInsuarace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, idInsuarace);
    }
}
