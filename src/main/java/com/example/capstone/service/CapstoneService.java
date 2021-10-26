package com.example.capstone.service;

import com.example.capstone.model.Capstone;
import com.example.capstone.repository.CapstoneRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CapstoneService {

    public Optional<Capstone> getCustomer(Long id) {
        return capstoneRepository.findById(id);
    }

    public  void deleteCustomer(Long id){
        capstoneRepository.deleteById(id);
    }

    public  void updateCustomer(Long id, String newTelephoneNumber){
        Optional<Capstone> customer = capstoneRepository.findById(id);
        if(customer != null){
            Capstone customerDetails = customer.get();
            customerDetails.setTelNumber(newTelephoneNumber);
            capstoneRepository.save(customerDetails);
        }
    }

    private final CapstoneRepository capstoneRepository;

    public CapstoneService(CapstoneRepository capstoneRepository) {
        this.capstoneRepository = capstoneRepository;
    }

    public List<Capstone> getAll() {
        return capstoneRepository.findAll();
    }

    public Capstone save(Capstone capstone) {
        return capstoneRepository.save(capstone);
    }
}
