package com.example.exe.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Contact", schema = "dbo", catalog = "EXE")
public class ContactEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_company")
    private String idCompany;
    @Basic
    @Column(name = "id_employee")
    private String idEmployee;
    @Basic
    @Column(name = "id_position")
    private String idPosition;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "time_begin")
    private Date timeBegin;
    @Basic
    @Column(name = "time_end")
    private Date timeEnd;
    @Basic
    @Column(name = "base_salary")
    private Double baseSalary;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "id_skill")
    private String idSkill;
    @Basic
    @Column(name = "id_level")
    private String idLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(String idSkill) {
        this.idSkill = idSkill;
    }

    public String getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(String idLevel) {
        this.idLevel = idLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(idCompany, that.idCompany) && Objects.equals(idEmployee, that.idEmployee) && Objects.equals(idPosition, that.idPosition) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(timeBegin, that.timeBegin) && Objects.equals(timeEnd, that.timeEnd) && Objects.equals(baseSalary, that.baseSalary) && Objects.equals(status, that.status) && Objects.equals(idSkill, that.idSkill) && Objects.equals(idLevel, that.idLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCompany, idEmployee, idPosition, name, description, timeBegin, timeEnd, baseSalary, status, idSkill, idLevel);
    }
}
