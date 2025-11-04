package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Cachorro;

public class CachorroTest {

    @Test
    public void testCriacaoCachorro() {
        Cachorro c = new Cachorro("Rex");
        assertEquals("Rex", c.getNome());
        assertEquals("Cachorro", c.getEspecie());
    }

    @Test
    public void testTalkCachorro() {
        Cachorro c = new Cachorro("Rex");
        assertDoesNotThrow(c::talk);
    }
}
