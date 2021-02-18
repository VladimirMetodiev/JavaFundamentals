package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    static String lastDigit(char a){
        String digit = "";
        switch (a){
            case '0': digit = "zero"; break;
            case '1': digit = "one"; break;
            case '2': digit = "two"; break;
            case '3': digit = "three"; break;
            case '4': digit = "four"; break;
            case '5': digit = "five"; break;
            case '6': digit = "six"; break;
            case '7': digit = "seven"; break;
            case '8': digit = "eight"; break;
            case '9': digit = "nine"; break;
            default: break;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anInput = input.nextLine();

        int lengthOfTheInput = anInput.length();
        char lastSymbol = anInput.charAt(lengthOfTheInput - 1);

        String anOutput = lastDigit(lastSymbol);

        System.out.println(anOutput);
    }
}
