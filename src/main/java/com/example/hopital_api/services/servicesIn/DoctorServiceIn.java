package com.example.hopital_api.services.servicesIn;


import com.example.hopital_api.dto.DepartDto;
import com.example.hopital_api.dto.DoctorDto;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.models.Doctor;

import java.util.List;

public interface DoctorServiceIn {
    void creerDoc(DoctorDto doctorDto);
    List<Doctor> findAlls();
    void deletedDepart(Long id);
}
