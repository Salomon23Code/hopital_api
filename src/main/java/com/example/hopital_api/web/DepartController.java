package com.example.hopital_api.web;

import com.example.hopital_api.dto.DepartDto;
import com.example.hopital_api.dto.PatientDto;
import com.example.hopital_api.models.Depart;
import com.example.hopital_api.models.Patient;
import com.example.hopital_api.repository.DepartRepository;
import com.example.hopital_api.services.serviceimp.DepartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v/dept")
public class DepartController {

    @Autowired
    DepartServiceImpl departService;

    @PostMapping("/depart")
    void creerDepart(@RequestBody DepartDto dto){
        this.departService.creerDepart(dto);
    }
    @GetMapping("/depart")
    List<Depart> findalls(){
        return this.departService.findAlls();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    void deletedDepart(@PathVariable("id") Integer id){
        this.departService.deletedDepart(id);
    }
}
