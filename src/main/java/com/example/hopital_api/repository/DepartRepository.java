package com.example.hopital_api.repository;

import com.example.hopital_api.models.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartRepository extends JpaRepository<Depart, Integer> {
    Optional<Object> findById(Long departId);
}
