package com.example.exe.models;

import com.example.exe.enums.SkillEnum;
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
@Table(name = "skill",schema = "dbo")
public class Skill {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 100)
    private String id;
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
    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private SkillEnum status;
    @Basic
    @Column(name = "isDeleted", nullable = true)
    private boolean isDelete;
    @OneToMany(mappedBy = "skillByIdSkill")
    private Collection<Contact> contactsById;
    @OneToMany(mappedBy = "skillByIdSkill")
    private Collection<Level> levelsById;
    @ManyToOne
    @JoinColumn(name = "id_position", referencedColumnName = "id", insertable = false, updatable = false)
    private Position positionByIdPosition;
}
