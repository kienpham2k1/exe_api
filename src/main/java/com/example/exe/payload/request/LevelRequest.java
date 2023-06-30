package com.example.exe.payload.request;

import com.example.exe.enums.LevelEnum;
import com.example.exe.models.Level;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
public class LevelRequest {
    private String description;
    private String idSkill;
    private Boolean isDeleted;
    private String name;
    private LevelEnum status = LevelEnum.WAITING;
}