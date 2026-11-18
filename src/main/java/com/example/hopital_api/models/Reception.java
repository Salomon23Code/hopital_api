package com.example.hopital_api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recepId;
    private String name;



    @ManyToOne
    private Bill bill;
}
