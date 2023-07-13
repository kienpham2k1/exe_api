package com.example.exe.models;

import com.example.exe.enums.SalaryEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salary", schema = "dbo")
public class Salary {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "id_employee", nullable = true, length = 100)
    private String idEmployee;
    @Basic
    @Column(name = "id_contact", nullable = true, length = 100)
    private String idContact;
    @Basic
    @Column(name = "id_timekeeping", nullable = true, length = 100)
    private String idTimekeeping;
    @Basic
    @Column(name = "gross", nullable = true, precision = 0)
    private Double gross;
    @Basic
    @Column(name = "net", nullable = true, precision = 0)
    private Double net;
    @Basic
    @Column(name = "time_begin", nullable = true)
    private Date timeBegin;
    @Basic
    @Column(name = "time_end", nullable = true)
    private Date timeEnd;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private SalaryEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_employee", referencedColumnName = "id", insertable = false, updatable = false)
    private Employee employeeByIdEmployee;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_contact", referencedColumnName = "id", insertable = false, updatable = false)
    private Contact contactByIdContact;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_timekeeping", referencedColumnName = "id", insertable = false, updatable = false)
    private Timekeeping timekeepingByIdTimekeeping;
}
