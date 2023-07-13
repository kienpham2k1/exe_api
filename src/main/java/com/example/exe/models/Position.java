package com.example.exe.models;

import com.example.exe.enums.PositionEnum;
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
@Table(name = "position", schema = "dbo")
public class Position {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private PositionEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "positionByIdPosition")
    @JsonIgnore
    private Collection<Contact> contactsById;
    @OneToMany(mappedBy = "positionByIdPosition")
    @JsonIgnore
    private Collection<Skill> skillsById;
}