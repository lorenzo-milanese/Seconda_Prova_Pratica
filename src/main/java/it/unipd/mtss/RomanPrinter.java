////////////////////////////////////////////////////////////////////
// Lorenzo Milanese 2117110
// Edoardo Granziero 2110996
////////////////////////////////////////////////////////////////////

package it.unipd.mtss; 
import java.util.HashMap;  

public class RomanPrinter{ 
    public static String print(int num){ 
        return printAsciiArt(IntegerToRoman.convert(num));
    } 
 
    private static String printAsciiArt(String romanNumber) { 
        if(romanNumber == "errore: numeri solo tra 1 e 10"){
            System.out.println(romanNumber);
            return romanNumber;
        }
            
        HashMap<String, String[]> AsciiArt = new HashMap<String, String[]>(); 
        AsciiArt.put("I", new String[] {" _____ ",
                                        "|_   _|",
                                        "  | |  ",
                                        "  | |  ",
                                        " _| |_ ",
                                        "|_____|"});
        AsciiArt.put("V", new String[] {"__      __",
                                        "\\ \\    / /",
                                        " \\ \\  / / ",
                                        "  \\ \\/ /  ",
                                        "   \\  /   ",
                                        "    \\/    "});
        AsciiArt.put("X", new String[] {"__   __",
                                        "\\ \\ / /",
                                        " \\ V / ",
                                        "  > <  ",
                                        " / . \\ ",
                                        "/_/ \\_\\"});
            
        int Len = romanNumber.length(); 
        String ris ="";
        
        for(int i = 0; i < 6; i++){ 
            for(int j = 0; j < Len; j++){ 
                String tmp = AsciiArt.get(String.valueOf(romanNumber.charAt(j)))[i];                 
                System.out.print(tmp); 
                System.out.print("  "); 
                ris += tmp + "  ";
            } 
            System.out.print("\n");
            ris += "\n";
        } 
        return ris;
    } 
  
 }
