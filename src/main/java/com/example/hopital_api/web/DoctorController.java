package com.example.hopital_api.web;

import com.example.hopital_api.dto.DoctorDto;
import com.example.hopital_api.models.Doctor;
import com.example.hopital_api.services.serviceimp.DoctorServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v/doc")
public class DoctorController {
    @Autowired
    DoctorServiceImpl doctorService;

    @PostMapping("/doct")
    void creerDepart(@Valid @RequestBody DoctorDto dto){
        this.doctorService.creerDoc(dto);
    }
    @GetMapping("/doct")
    List<Doctor> findalls(){
        return this.doctorService.findAlls();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    void deletedDepart(@PathVariable("id") Long id){
        this.doctorService.deletedDepart(id);
    }
}
