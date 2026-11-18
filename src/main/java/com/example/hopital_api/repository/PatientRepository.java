package com.example.hopital_api.repository;

import com.example.hopital_api.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient getReferenceById(String paName);

}
