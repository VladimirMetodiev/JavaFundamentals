package DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for(char letter1 = 'a'; letter1 < 'a' + number; letter1++){
            for(char letter2 = 'a'; letter2 < 'a' + number; letter2++){
                for(char letter3 = 'a'; letter3 < 'a' + number; letter3++){
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
    }
}
