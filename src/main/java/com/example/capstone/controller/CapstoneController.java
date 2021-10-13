package com.example.capstone.controller;

import com.example.capstone.model.Capstone;
import com.example.capstone.service.CapstoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
