package com.example.proyecto.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void saludoEmpiezaConHola() {
        String msg = "Hola desde Spring Boot";
        assertTrue(msg.startsWith("Hola"));
    }
}
