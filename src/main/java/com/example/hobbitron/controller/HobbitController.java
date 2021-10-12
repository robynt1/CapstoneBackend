package com.example.hobbitron.controller;

import com.example.hobbitron.model.Hobbit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {
    // superpower: create an endpoint: localhost:<server.port>/hobbits
    @GetMapping("/hobbits")
    List<Hobbit> getAll() {
        return List.of(
                new Hobbit(1L, "Frodo", "Baggins"),
                new Hobbit(2L, "Billbo", "Baggins"),
                new Hobbit(3L, "Penelope", "Tuk")
        );
    }
}
