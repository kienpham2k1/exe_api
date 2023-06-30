package com.example.exe.models;

import com.example.exe.enums.DependentEnum;
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
@Table(name = "dependent", schema = "dbo")
public class Dependent {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "relation_description", nullable = true, length = 100)
    private String relationDescription;
    @Basic
    @Column(name = "id_employee", nullable = true, length = 100)
    private String idEmployee;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private DependentEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id", insertable = false, updatable = false)
    private Employee employeeByIdEmployee;
}
