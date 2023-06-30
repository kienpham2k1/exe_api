package com.example.exe.payload.request;

import com.example.exe.enums.PositionEnum;
import com.example.exe.models.Position;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
public class PositionRequest {
    private Boolean isDeleted;
    private String name;
    private PositionEnum status = PositionEnum.WAITING;
}