package com.example.hopital_api.services.serviceimp;

import com.example.hopital_api.dto.DoctorDto;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.models.Doctor;
import com.example.hopital_api.repository.DepartRepository;
import com.example.hopital_api.repository.DoctorRepository;
import com.example.hopital_api.services.servicesIn.DoctorServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorServiceIn {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    DepartRepository departRepository;
    @Override
    public void creerDoc(DoctorDto dto) {
        if (dto.getDepartId() == null) {
            throw new RuntimeException("DepartId est obligatoire");
        }

        Depart depart = departRepository.findById(dto.getDepartId().intValue())
                .orElseThrow(() -> new RuntimeException("Département introuvable pour l'id: " + dto.getDepartId()));
        Doctor doc = new Doctor();
        doc.setName(dto.getName());
        doc.setSpecialisation(dto.getSpecialisation());
        doc.setPhone(dto.getPhone());
        doc.setDepart(depart);
        this.doctorRepository.save(doc);

    }

    @Override
    public List<Doctor> findAlls() {
        return this.doctorRepository.findAll();
    }

    @Override
    public void deletedDepart(Long id) {
        this.doctorRepository.deleteById(id);

    }
}
