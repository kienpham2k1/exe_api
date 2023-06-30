package com.example.exe.payload.request;

import com.example.exe.enums.SkillEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
public class SkillRequest {
    private String description;
    private String idPosition;
    private Boolean isDeleted;
    private String name;
    private SkillEnum status = SkillEnum.WAITING;
}