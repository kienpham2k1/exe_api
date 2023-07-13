package com.example.exe.models;

import com.example.exe.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role", schema = "dbo")
public class Role {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "id_company", nullable = true, length = 100)
    private String idCompany;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private RoleEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "roleByIdRole")
    @JsonIgnore
    private Collection<User> usersById;
}