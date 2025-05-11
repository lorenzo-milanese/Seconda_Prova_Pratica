////////////////////////////////////////////////////////////////////
// Lorenzo Milanese 2117110
// Edoardo Granziero 2110996
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumeriValidiDa1a10() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testNumeroZero() {
        assertEquals("errore: numeri solo tra 1 e 10", IntegerToRoman.convert(0));
    }

    @Test
    public void testNumeroNegativo() {
        assertEquals("errore: numeri solo tra 1 e 10", IntegerToRoman.convert(-3));
    }

    @Test
    public void testNumeroOltreDieci() {
        assertEquals("errore: numeri solo tra 1 e 10", IntegerToRoman.convert(11));
    }
}