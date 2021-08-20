package com.example.PizzaApplication.controllers;

import com.example.PizzaApplication.repositories.PizzaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PizzaControllerTest {

    @Mock
    PizzaRepository pizzaRepository;

    @Test
    void getAllPizzas() {

        PizzaController pizzaController = new PizzaController(pizzaRepository);
        assertThat(pizzaController.getAllPizzas()).isEmpty();
    }

}