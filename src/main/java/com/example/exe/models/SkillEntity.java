package com.example.exe.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "skill", schema = "dbo", catalog = "EXE")
public class SkillEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_position")
    private String idPosition;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        SkillEntity that = (SkillEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(idPosition, that.idPosition) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPosition, name, description, status);
    }
}
