package com.example.hopital_api.web;

import com.example.hopital_api.dto.PatientDto;
import com.example.hopital_api.models.Patient;
import com.example.hopital_api.services.serviceimp.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v/pat")
public class PatientController {
    @Autowired
    PatientServiceImpl patientService;

    @PostMapping("/patient")
    void creerPatient(@RequestBody PatientDto dto){
        this.patientService.creerPatient(dto);
    }
    @GetMapping("/patient")
    List<Patient> findalls(){
        return this.patientService.findAlls();
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Patient updatePatient(@RequestBody Patient patient){
        return this.patientService.updatePatient(patient);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public PatientDto getPatient(@PathVariable("id") Long id){
        return this.patientService.getPatient(id);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    void deletedPatient(@PathVariable("id") Long id){
        this.patientService.deletedPatient(id);
    }
}
