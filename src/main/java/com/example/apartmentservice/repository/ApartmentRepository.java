package com.example.apartmentservice.repository;

import com.example.apartmentservice.entities.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
}
