package com.example.hobbitron.service;

import com.example.hobbitron.model.Hobbit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbitService {
    public List<Hobbit> getAll() {
        return List.of(
                new Hobbit(1L, "Frodo", "Baggins"),
                new Hobbit(2L, "Bilbo", "Baggins"),
                new Hobbit(3L, "Penelope", "Tuk")
        );
    }
}
