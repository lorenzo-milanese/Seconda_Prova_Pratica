////////////////////////////////////////////////////////////////////
// Lorenzo Milanese 2117110
// Edoardo Granziero 2110996
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_III() {
        // Arrange
        int number = 3;
        String expected =
                        " _____    _____    _____   \n" +
                        "|_   _|  |_   _|  |_   _|  \n" +
                        "  | |      | |      | |    \n" +
                        "  | |      | |      | |    \n" +
                        " _| |_    _| |_    _| |_   \n" +
                        "|_____|  |_____|  |_____|  \n";
        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }

    @Test
    public void testPrint_XLIX() {
        int number = 49;
        String expected =
                "__   __   _         _____   __   __  \n" +
                        "\\ \\ / /  | |       |_   _|  \\ \\ / /  \n" +
                        " \\ V /   | |         | |     \\ V /   \n" +
                        "  > <    | |         | |      > <    \n" +
                        " / . \\   | |____    _| |_    / . \\   \n" +
                        "/_/ \\_\\  |______|  |_____|  /_/ \\_\\  \n";
        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }

    @Test
    public void testPrint_M() {
        int number = 1000;
        String expected =
                " __  __   \n" +
                        "|  \\/  |  \n" +
                        "| \\  / |  \n" +
                        "| |\\/| |  \n" +
                        "| |  | |  \n" +
                        "|_|  |_|  \n";
        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }
}