package com.example.capstone.controller;

import com.example.capstone.model.Capstone;
import com.example.capstone.service.CapstoneService;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CapstoneController {

    private final CapstoneService service;

    public CapstoneController(CapstoneService service) {
        this.service = service;
    }

    @GetMapping("/capstone")
    List<Capstone> getAll() {
        return service.getAll();
    }

    @PostMapping("/capstone")
    Capstone save(@RequestBody Capstone capstone) {
        return service.save(capstone);
    }
}

