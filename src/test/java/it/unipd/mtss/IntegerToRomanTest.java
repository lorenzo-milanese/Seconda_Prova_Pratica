////////////////////////////////////////////////////////////////////
// Lorenzo Milanese 2117110
// Edoardo Granziero 2110996
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_ValidNumber() {
        int number = 58;
        String result = IntegerToRoman.convert(number);
        assertEquals("LVIII", result);
    }

    @Test
    public void testConvert_UpperBoundary() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }

    @Test
    public void testConvert_LowerBoundary() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void testConvert_Zero() {
        int number = 0;
        String result = IntegerToRoman.convert(number);
        assertEquals("errore: numeri solo tra 1 e 1000", result);
    }

    @Test
    public void testConvert_NegativeNumber() {
        int number = -5;
        String result = IntegerToRoman.convert(number);
        assertEquals("errore: numeri solo tra 1 e 1000", result);
    }

    @Test
    public void testConvert_NumberOver1000() {
        int number = 1500;
        String result = IntegerToRoman.convert(number);
        assertEquals("errore: numeri solo tra 1 e 1000", result);
    }
}
