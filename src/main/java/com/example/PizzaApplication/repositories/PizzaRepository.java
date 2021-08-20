package com.example.PizzaApplication.repositories;

import com.example.PizzaApplication.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    Pizza findPizzaByName(String name);
    Pizza findPizzaById(Long id);
}