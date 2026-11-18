package com.example.hopital_api.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;


@Entity
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String BillNo;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;




    @OneToMany(mappedBy = "bill")
    @JsonIgnore
    Collection<Reception> receptions = new ArrayList<>();
}
