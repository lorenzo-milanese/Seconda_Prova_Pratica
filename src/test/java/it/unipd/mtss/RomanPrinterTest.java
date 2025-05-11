package it.unipd.mtss;
////////////////////////////////////////////////////////////////////
// Lorenzo Milanese 2117110
// Edoardo Granziero 2110996
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testAsciiArtOfI() {
        String output = RomanPrinter.print(1);
        assertTrue(output.contains(" _____ "));
        assertTrue(output.contains("|_____|"));
    }

    @Test
    public void testAsciiArtOfV() {
        String output = RomanPrinter.print(5);
        assertTrue(output.contains("__      __"));
        assertTrue(output.contains("    \\/    "));
    }

    @Test
    public void testAsciiArtOfX() {
        String output = RomanPrinter.print(10);
        assertTrue(output.contains("__   __"));
        assertTrue(output.contains("/_/ \\_\\"));
    }

    @Test
    public void testErrorePerInputNonValido() {
        String output = RomanPrinter.print(0);
        assertEquals("errore: numeri solo tra 1 e 10", output);
    }
}