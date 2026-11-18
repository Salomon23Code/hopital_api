package com.example.hopital_api.services.serviceimp;

import com.example.hopital_api.dto.BillDto;
import com.example.hopital_api.models.Bill;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.models.Patient;
import com.example.hopital_api.repository.BillRepository;
import com.example.hopital_api.repository.PatientRepository;
import com.example.hopital_api.services.servicesIn.BillServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class BillServicesImpl implements BillServiceIn {

    @Autowired
    BillRepository billRepository;

    @Autowired
    PatientRepository patientRepository;

    @Override
    public void creerbill(BillDto billDto) {
        if (billDto.getPatientId() == null) {
            throw new RuntimeException("PatientId est obligatoire");
        }
        Patient patient = patientRepository.findById(Long.valueOf(billDto.getPatientId().intValue()))
                .orElseThrow(() -> new RuntimeException("Département introuvable pour l'id: " + billDto.getPatientId()));
        //Optional<Patient> patient = Optional.of(this.patientRepository.getReferenceById(billDto.getPatientId()));

            Bill bill = new Bill();
            bill.setBillNo(generetdeNum());
            bill.setAmount(billDto.getAmount());
            bill.setPatient(patient);

            this.billRepository.save(bill);

    }
    @Override
    public List<Bill> findAlls() {
        return this.billRepository.findAll();
    }
    private static String generetdeNum(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append("0");
        }
        for(int i=0;i<4;i++){
            sb.append(random.nextInt(2));
        }
        for(int i=0; i<10;i++){
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
