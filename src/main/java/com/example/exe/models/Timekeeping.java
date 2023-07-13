package com.example.exe.models;

import com.example.exe.enums.TimekeepingEnum;
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
@Table(name = "timekeeping", schema = "dbo")
public class Timekeeping {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "start_date", nullable = true)
    private Date startDate;
    @Basic
    @Column(name = "end_date", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "standard_number", nullable = true, precision = 0)
    private Double standardNumber;
    @Basic
    @Column(name = "work_days_number", nullable = true, precision = 0)
    private Double workDaysNumber;
    @Basic
    @Column(name = "work_days_off_number", nullable = true, precision = 0)
    private Double workDaysOffNumber;
    @Basic
    @Column(name = "work_holidays_number", nullable = true, precision = 0)
    private Double workHolidaysNumber;
    @Basic
    @Column(name = "day_uppaid_leave_number", nullable = true, precision = 0)
    private Double dayUppaidLeaveNumber;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private TimekeepingEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "timekeeping", fetch = FetchType.EAGER)
    private Collection<Employee> employees;
    @OneToMany(mappedBy = "timekeeping", fetch = FetchType.EAGER)
    private Collection<Salary> salaries;
}
