package com.example.hobbitron.repository;

import com.example.hobbitron.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
