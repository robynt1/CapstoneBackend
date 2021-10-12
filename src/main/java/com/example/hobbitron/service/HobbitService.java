package com.example.hobbitron.service;

import com.example.hobbitron.model.Hobbit;
import com.example.hobbitron.repository.HobbitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbitService {

    private final HobbitRepository hobbitRepository;

    public HobbitService(HobbitRepository hobbitRepository) {
        this.hobbitRepository = hobbitRepository;
    }

    public List<Hobbit> getAll() {
        return hobbitRepository.findAll();
    }
}
