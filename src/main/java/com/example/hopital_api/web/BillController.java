package com.example.hopital_api.web;

import com.example.hopital_api.dto.BillDto;
import com.example.hopital_api.models.Bill;
import com.example.hopital_api.services.serviceimp.BillServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v")
public class BillController {

    @Autowired
    BillServicesImpl billServices;

    @PostMapping("/bill")
    void creerBill(@RequestBody BillDto dto){
        this.billServices.creerbill(dto);
    }
    @GetMapping("/bill")
    List<Bill> findAll(){
        return billServices.findAlls();

    }
}
