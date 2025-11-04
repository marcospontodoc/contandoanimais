package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Animal;

public class AnimalTest {

    @Test
    public void testCriacaoAnimal() {
        Animal a = new Animal("Animal", "genérico");
        assertEquals("Animal", a.getNome());
        assertEquals("genérico", a.getEspecie());
    }

    @Test
    public void testTalkPadrao() {
        Animal a = new Animal("Animal", "genérico");
        assertDoesNotThrow(a::talk);
    }
}
