package com.example.exe.models;

import com.example.exe.enums.ContactEnum;
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
@Table(name = "contact" ,schema = "dbo")
public class Contact {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "id_company", nullable = true, length = 100)
    private String idCompany;
    @Basic
    @Column(name = "id_employee", nullable = true, length = 100)
    private String idEmployee;
    @Basic
    @Column(name = "id_position", nullable = true, length = 100)
    private String idPosition;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
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
    @Column(name = "base_salary", nullable = true, precision = 0)
    private Double baseSalary;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private ContactEnum status;
    @Basic
    @Column(name = "id_skill", nullable = true, length = 100)
    private String idSkill;
    @Basic
    @Column(name = "id_level", nullable = true, length = 100)
    private String idLevel;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "id", insertable = false, updatable = false)
    private Company companyByIdCompany;
    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id", insertable = false, updatable = false)
    private Employee employeeByIdEmployee;
    @ManyToOne
    @JoinColumn(name = "id_position", referencedColumnName = "id", insertable = false, updatable = false)
    private Position positionByIdPosition;
    @ManyToOne
    @JoinColumn(name = "id_skill", referencedColumnName = "id", insertable = false, updatable = false)
    private Skill skillByIdSkill;
    @ManyToOne
    @JoinColumn(name = "id_level", referencedColumnName = "id", insertable = false, updatable = false)
    private Level levelByIdLevel;
    @OneToMany(mappedBy = "contactByIdContact")
    private Collection<Salary> salariesById;
}
