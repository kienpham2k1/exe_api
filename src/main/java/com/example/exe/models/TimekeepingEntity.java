package com.example.exe.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Timekeeping", schema = "dbo", catalog = "EXE")
public class TimekeepingEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "start_date")
    private Date startDate;
    @Basic
    @Column(name = "end_date")
    private Date endDate;
    @Basic
    @Column(name = "standard_number")
    private String standardNumber;
    @Basic
    @Column(name = "work_days_number")
    private String workDaysNumber;
    @Basic
    @Column(name = "work_days_off_number")
    private String workDaysOffNumber;
    @Basic
    @Column(name = "work_holidays_number")
    private String workHolidaysNumber;
    @Basic
    @Column(name = "day_uppaid_leave_number")
    private String dayUppaidLeaveNumber;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStandardNumber() {
        return standardNumber;
    }

    public void setStandardNumber(String standardNumber) {
        this.standardNumber = standardNumber;
    }

    public String getWorkDaysNumber() {
        return workDaysNumber;
    }

    public void setWorkDaysNumber(String workDaysNumber) {
        this.workDaysNumber = workDaysNumber;
    }

    public String getWorkDaysOffNumber() {
        return workDaysOffNumber;
    }

    public void setWorkDaysOffNumber(String workDaysOffNumber) {
        this.workDaysOffNumber = workDaysOffNumber;
    }

    public String getWorkHolidaysNumber() {
        return workHolidaysNumber;
    }

    public void setWorkHolidaysNumber(String workHolidaysNumber) {
        this.workHolidaysNumber = workHolidaysNumber;
    }

    public String getDayUppaidLeaveNumber() {
        return dayUppaidLeaveNumber;
    }

    public void setDayUppaidLeaveNumber(String dayUppaidLeaveNumber) {
        this.dayUppaidLeaveNumber = dayUppaidLeaveNumber;
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
        TimekeepingEntity that = (TimekeepingEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(standardNumber, that.standardNumber) && Objects.equals(workDaysNumber, that.workDaysNumber) && Objects.equals(workDaysOffNumber, that.workDaysOffNumber) && Objects.equals(workHolidaysNumber, that.workHolidaysNumber) && Objects.equals(dayUppaidLeaveNumber, that.dayUppaidLeaveNumber) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, endDate, standardNumber, workDaysNumber, workDaysOffNumber, workHolidaysNumber, dayUppaidLeaveNumber, status);
    }
}
