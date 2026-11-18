package com.example.hopital_api.services.serviceimp;

import com.example.hopital_api.dto.PatientDto;
import com.example.hopital_api.models.Doctor;
import com.example.hopital_api.models.Patient;
import com.example.hopital_api.models.Rooms;
import com.example.hopital_api.repository.DoctorRepository;
import com.example.hopital_api.repository.PatientRepository;
import com.example.hopital_api.repository.RoomsRepository;
import com.example.hopital_api.services.servicesIn.PatientServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PatientServiceImpl implements PatientServiceIn {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    RoomsRepository roomsRepository;
    @Override
    public void creerPatient(PatientDto patientDto) {
        if (patientDto.getDoctorId()== null) {
            throw new RuntimeException("Doctor est obligatoire");
        }
        if (patientDto.getRoomId()== null) {
            throw new RuntimeException("Room est obligatoire");
        }

        Doctor doctor = doctorRepository.findById(patientDto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Médecin introuvable pour l'id: " + patientDto.getDoctorId()));
        Rooms room = roomsRepository.findById(patientDto.getRoomId())
                .orElseThrow(() -> new RuntimeException("Room introuvable"));
        Patient pat = new Patient();
        pat.setPaName(patientDto.getPaName());
        pat.setPhone(patientDto.getPhone());
        pat.setAdresse(patientDto.getAdresse());
        pat.setAge(patientDto.getAge());
        pat.setSex(patientDto.getSex());
        pat.setDoctor(doctor);
        pat.setDoctorId(patientDto.getDoctorId());
        pat.setRoom(room);
        this.patientRepository.save(pat);

    }

    @Override
    public List<Patient> findAlls() {
        return this.patientRepository.findAll();
    }

    @Override
    public void deletedPatient(Long id) {
        this.patientRepository.deleteById(id);

    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public PatientDto getPatient(Long id) {
        return this.patientRepository.findById(id).get();
    }

}
