package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Peixe;

public class PeixeTest {

    @Test
    public void testCriacaoPeixe() {
        Peixe p = new Peixe("Nemo");
        assertEquals("Nemo", p.getNome());
        assertEquals("Peixe", p.getEspecie());
    }

    @Test
    public void testTalkPeixe() {
        Peixe p = new Peixe("Nemo");
        assertDoesNotThrow(p::talk);
    }
}
