package com.example.apartmentservice.Service;

import com.example.apartmentservice.entities.Apartment;
import com.example.apartmentservice.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ApartmentServiceImpl implements ApartmentService{
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public List<Apartment> findAll() {
        return apartmentRepository.findAll();
    }

    @Override
    public Apartment findById(int id) {
        Optional<Apartment> rs = apartmentRepository.findById(id);
        Apartment apartment = null;
        if (rs.isPresent()) {
            apartment = rs.get();
        }
        return apartment;
    }

    @Override
    public void save(Apartment apartment) {
        apartmentRepository.save(apartment);
    }

    @Override
    public void deleteById(int id) {
        apartmentRepository.deleteById(id);
    }
}
