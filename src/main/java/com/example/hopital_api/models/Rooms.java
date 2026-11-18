package com.example.hopital_api.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "room_no")
    private String RoomNo;
    private String local;

    @OneToMany(mappedBy = "room")
    @JsonIgnore
    List<Patient> patients;
}
