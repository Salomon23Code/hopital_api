package com.example.hopital_api.models;


import com.example.hopital_api.dto.PatientDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient extends PatientDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paName;
    private String phone;
    private String adresse;
    private int age;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Rooms room;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;




}
