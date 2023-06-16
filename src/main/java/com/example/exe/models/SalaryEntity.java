package com.example.exe.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Salary", schema = "dbo", catalog = "EXE")
public class SalaryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_employee")
    private String idEmployee;
    @Basic
    @Column(name = "id_contact")
    private String idContact;
    @Basic
    @Column(name = "id_timekeeping")
    private String idTimekeeping;
    @Basic
    @Column(name = "gross")
    private Double gross;
    @Basic
    @Column(name = "net")
    private Double net;
    @Basic
    @Column(name = "time_begin")
    private Date timeBegin;
    @Basic
    @Column(name = "time_end")
    private Date timeEnd;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
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
        SalaryEntity that = (SalaryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(idEmployee, that.idEmployee) && Objects.equals(idContact, that.idContact) && Objects.equals(idTimekeeping, that.idTimekeeping) && Objects.equals(gross, that.gross) && Objects.equals(net, that.net) && Objects.equals(timeBegin, that.timeBegin) && Objects.equals(timeEnd, that.timeEnd) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idEmployee, idContact, idTimekeeping, gross, net, timeBegin, timeEnd, status);
    }
}
