package com.example.hopital_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BillDto {
    private String BillNo;
    private Double amount;
    @NotNull(message = "patientId est obligatoire")
    private Long patientId;
}
