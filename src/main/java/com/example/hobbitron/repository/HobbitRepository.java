package com.example.hobbitron.repository;

import com.example.hobbitron.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    superpowers:
    - DAO implementation (covered by Spring Data)
    - no need to implement anything, in case extending an interface is not enough:
        - use @Query
        - implement DAO on your own
    - MyRepository extends RepositoryInterfaceFromSpringData<EntityClass, PrimaryKeyInEntityClass>
 */
public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
