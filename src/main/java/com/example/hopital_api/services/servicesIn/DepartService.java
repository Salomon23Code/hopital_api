package com.example.hopital_api.services.servicesIn;

import com.example.hopital_api.dto.DepartDto;
import com.example.hopital_api.models.Depart;

import java.util.List;

public interface DepartService {
    void creerDepart(DepartDto departDto);
    List<Depart> findAlls();
    void deletedDepart(Integer id);

}
