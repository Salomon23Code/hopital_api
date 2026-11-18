package com.example.hopital_api.services.servicesIn;

import com.example.hopital_api.dto.DepartDto;
import com.example.hopital_api.dto.PatientDto;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.models.Patient;

import java.util.List;

public interface PatientServiceIn {
    void creerPatient(PatientDto patientDto);
    List<Patient> findAlls();
    void deletedPatient(Long id);
    Patient updatePatient(Patient patient);
    PatientDto getPatient(Long id);
}
