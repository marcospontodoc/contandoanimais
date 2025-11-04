package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Gato;

public class GatoTest {

    @Test
    public void testCriacaoGato() {
        Gato g = new Gato("Luna");
        assertEquals("Luna", g.getNome());
        assertEquals("Gato", g.getEspecie());
    }

    @Test
    public void testTalkGato() {
        Gato g = new Gato("Luna");
        assertDoesNotThrow(g::talk);
    }
}
