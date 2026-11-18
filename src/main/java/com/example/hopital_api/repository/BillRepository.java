package com.example.hopital_api.repository;

import com.example.hopital_api.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer>{
}
