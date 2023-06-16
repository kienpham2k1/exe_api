package com.example.exe.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Employee", schema = "dbo", catalog = "EXE")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Basic
    @Column(name = "id_department")
    private String idDepartment;
    @Basic
    @Column(name = "id_contact")
    private String idContact;
    @Basic
    @Column(name = "id_timekeeping")
    private String idTimekeeping;
    @Basic
    @Column(name = "id_position")
    private String idPosition;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String idContact) {
        this.idContact = idContact;
    }

    public String getIdTimekeeping() {
        return idTimekeeping;
    }

    public void setIdTimekeeping(String idTimekeeping) {
        this.idTimekeeping = idTimekeeping;
    }

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
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
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(idDepartment, that.idDepartment) && Objects.equals(idContact, that.idContact) && Objects.equals(idTimekeeping, that.idTimekeeping) && Objects.equals(idPosition, that.idPosition) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumber, dateOfBirth, idDepartment, idContact, idTimekeeping, idPosition, status);
    }
}
