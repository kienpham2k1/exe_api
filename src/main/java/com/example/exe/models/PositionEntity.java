package com.example.exe.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Position", schema = "dbo", catalog = "EXE")
public class PositionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        PositionEntity that = (PositionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
}
