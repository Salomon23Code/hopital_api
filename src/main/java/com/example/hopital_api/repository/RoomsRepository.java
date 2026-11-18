package com.example.hopital_api.repository;

import com.example.hopital_api.models.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomsRepository extends JpaRepository<Rooms, Long> {
}
