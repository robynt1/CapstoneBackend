package com.example.capstone.service;

import com.example.capstone.model.Capstone;
import com.example.capstone.repository.CapstoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapstoneService {

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
