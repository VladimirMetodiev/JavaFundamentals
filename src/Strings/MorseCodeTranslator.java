package Strings;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] morseCode= input.nextLine().split("\\s+");

        translateTheCode(morseCode);
    }


    public static void translateTheCode(String[] morseCode){
        StringBuilder translatedCode = new StringBuilder();

        for(int a = 0; a < morseCode.length; a++){
            translatedCode.append(getSymbol(morseCode[a]));
        }

        System.out.println(translatedCode);
    }


    public static String getSymbol(String symbol){
        String result = "";

        switch(symbol){
            case ".-": result = "A"; break;
            case "-...": result = "B"; break;
            case "-.-.": result = "C"; break;
            case "-..": result = "D"; break;
            case ".": result = "E"; break;
            case "..-.": result = "F"; break;
            case "--.": result = "G"; break;
            case "....": result = "H"; break;
            case "..": result = "I"; break;
            case ".---": result = "J"; break;
            case "-.-": result = "K"; break;
            case ".-..": result = "L"; break;
            case "--": result = "M"; break;
            case "-.": result = "N"; break;
            case "---": result = "O"; break;
            case ".--.": result = "P"; break;
            case "--.-": result = "Q"; break;
            case ".-.": result = "R"; break;
            case "...": result = "S"; break;
            case "-": result = "T"; break;
            case "..-": result = "U"; break;
            case "...-": result = "V"; break;
            case ".--": result = "W"; break;
            case "-..-": result = "X"; break;
            case "-.--": result = "Y"; break;
            case "--..": result = "Z"; break;
            case "|": result = " "; break;
            default: break;
        }

        return result;
    }
}



//0     -----
//1     .----
//2     ..---
//3     ...--
//4     ....-
//5     .....
//6     -....
//7     --...
//8     ---..
//9     ----.


