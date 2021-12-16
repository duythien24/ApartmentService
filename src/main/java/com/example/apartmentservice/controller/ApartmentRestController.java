package com.example.apartmentservice.controller;

import com.example.apartmentservice.Service.ApartmentService;
import com.example.apartmentservice.entities.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentRestController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("")
    public List<Apartment> findAll(){
        return apartmentService.findAll();
    }

    @GetMapping("/{id}")
    public Apartment findById(@PathVariable int id){
        return apartmentService.findById(id);
    }

    @PostMapping("")
    public void save(@RequestBody Apartment apartment) {
        apartmentService.save(apartment);
    }

    @PutMapping("")
    public void update(@RequestBody Apartment apartment) {
        apartmentService.save(apartment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        apartmentService.deleteById(id);
    }
}
