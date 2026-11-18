package com.example.hopital_api.services.servicesIn;

import com.example.hopital_api.dto.BillDto;
import com.example.hopital_api.models.Bill;


import java.util.List;

public interface BillServiceIn {
    void creerbill(BillDto billDto);
    List<Bill> findAlls();
}
