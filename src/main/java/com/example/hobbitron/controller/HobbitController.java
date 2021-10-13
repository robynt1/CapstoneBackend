package com.example.hobbitron.controller;

import com.example.hobbitron.model.Hobbit;
import com.example.hobbitron.service.HobbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {

    private final HobbitService service;

    /*
        Using the main Spring's superpower: Dependency Injection
        @no Autowired needed - only one constructor
     */
    public HobbitController(HobbitService service) {
        this.service = service;
    }

    @GetMapping("/hobbits")
    List<Hobbit> getAll() {
        return service.getAll();
    }
}
