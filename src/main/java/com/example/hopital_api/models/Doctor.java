package com.example.hopital_api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String specialisation;
    private String phone;


    @ManyToOne
    @JoinColumn(name = "depart_id", nullable = false)
    private Depart depart;
    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    Collection<Patient> patients = new ArrayList<>();

}
