package com.example.hopital_api.repository;

import com.example.hopital_api.models.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionRepository extends JpaRepository<Reception, Integer> {
}
