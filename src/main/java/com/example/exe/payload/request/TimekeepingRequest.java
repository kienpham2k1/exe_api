package com.example.exe.payload.request;

import com.example.exe.enums.TimekeepingEnum;
import com.example.exe.models.Timekeeping;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
public class TimekeepingRequest {
    private Double dayUppaidLeaveNumber;
    private Date endDate;
    private Boolean isDeleted;
    private Double standardNumber;
    private Date startDate;
    private TimekeepingEnum status =TimekeepingEnum.WAITING;
    private Double workDaysNumber;
    private Double workDaysOffNumber;
    private Double workHolidaysNumber;}