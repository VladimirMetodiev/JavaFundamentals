package Strings;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split("\\s+");

        char theFirstLetter, theLastLetter;
        String current;
        double number, sum = 0;

        for(int a = 0; a < data.length; a++){
            theFirstLetter = data[a].charAt(0);
            theLastLetter = data[a].charAt(data[a].length() - 1);
            current = data[a].substring(1, data[a].length() - 1);
            number = Double.parseDouble(current);

            if((int)theFirstLetter >= 65 && (int)theFirstLetter <= 90){
                number /= getThePosition(theFirstLetter);
            }
            else if((int)theFirstLetter >= 97 && (int)theFirstLetter <= 122){
                number *= getThePosition(theFirstLetter);
            }

            if((int)theLastLetter >= 65 && (int)theLastLetter <= 90){
                number -= getThePosition(theLastLetter);
            }
            else if((int)theLastLetter >= 97 && (int)theLastLetter <= 122){
                number += getThePosition(theLastLetter);
            }

            sum += number;
        }

        System.out.printf("%.2f", sum);
    }

    public static int getThePosition(char letter){
        int result = 0;

        switch (("" + letter).toLowerCase()){
            case "a": result = 1; break;
            case "b": result = 2; break;
            case "c": result = 3; break;
            case "d": result = 4; break;
            case "e": result = 5; break;
            case "f": result = 6; break;
            case "g": result = 7; break;
            case "h": result = 8; break;
            case "i": result = 9; break;
            case "j": result = 10; break;
            case "k": result = 11; break;
            case "l": result = 12; break;
            case "m": result = 13; break;
            case "n": result = 14; break;
            case "o": result = 15; break;
            case "p": result = 16; break;
            case "q": result = 17; break;
            case "r": result = 18; break;
            case "s": result = 19; break;
            case "t": result = 20; break;
            case "u": result = 21; break;
            case "v": result = 22; break;
            case "w": result = 23; break;
            case "x": result = 24; break;
            case "y": result = 25; break;
            case "z": result = 26; break;
            default: break;
        }

        return result;
    }
}
