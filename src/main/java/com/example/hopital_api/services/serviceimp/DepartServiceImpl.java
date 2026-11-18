package com.example.hopital_api.services.serviceimp;

import com.example.hopital_api.dto.DepartDto;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.repository.DepartRepository;
import com.example.hopital_api.services.servicesIn.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    DepartRepository departRepository;

    @Override
    public void creerDepart(DepartDto departDto) {
        Depart depart = new Depart();
        depart.setName(departDto.getName());
        this.departRepository.save(depart);

    }

    @Override
    public List<Depart> findAlls() {
        return this.departRepository.findAll();
    }

    @Override
    public void deletedDepart(Integer id) {
        this.departRepository.deleteById(id);

    }
}
