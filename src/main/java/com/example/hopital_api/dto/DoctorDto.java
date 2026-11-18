package com.example.hopital_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DoctorDto {

    private String name;
    private String specialisation;
    private String phone;

    @NotNull(message = "DepartId est obligatoire")
    private Long departId;
}
