package com.example.hopital_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PatientDto {
    private String paName;
    private String phone;
    private String adresse;
    private int age;
    private String sex;

    @NotNull(message = "DoctorId est obligatoire")
    private Long doctorId;

    @NotNull(message = "RoomId est obligatoire")
    private Long roomId;
}
