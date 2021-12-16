package com.example.apartmentservice.Service;


import com.example.apartmentservice.entities.Apartment;

import java.util.List;


public interface ApartmentService {
    public List<Apartment> findAll();
    public Apartment findById(int id);
    public void save(Apartment apartment);
    public void deleteById(int id);
}
