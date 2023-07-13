package com.example.exe.models;

import com.example.exe.enums.UserEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "[user]", schema = "dbo")
public class User {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "id_company", nullable = true, length = 100)
    private String idCompany;
    @Basic
    @Column(name = "id_role", nullable = true, length = 100)
    private String idRole;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private UserEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_company", referencedColumnName = "id", insertable = false, updatable = false)
    private Company company;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_role", referencedColumnName = "id", insertable = false, updatable = false)
    private Role role;
}
