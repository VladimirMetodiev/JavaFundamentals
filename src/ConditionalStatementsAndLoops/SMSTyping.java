package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class SMSTyping {
    static char addLetter(int a){
        char newLetter = '!';
        switch (a){
            case 0: newLetter = ' '; break;
            case 2: newLetter = 'a'; break;
            case 22: newLetter = 'b'; break;
            case 222: newLetter = 'c'; break;
            case 3: newLetter = 'd'; break;
            case 33: newLetter = 'e'; break;
            case 333: newLetter = 'f'; break;
            case 4: newLetter = 'g'; break;
            case 44: newLetter = 'h'; break;
            case 444: newLetter = 'i'; break;
            case 5: newLetter = 'j'; break;
            case 55: newLetter = 'k'; break;
            case 555: newLetter = 'l'; break;
            case 6: newLetter = 'm'; break;
            case 66: newLetter = 'n'; break;
            case 666: newLetter = 'o'; break;
            case 7: newLetter = 'p'; break;
            case 77: newLetter = 'q'; break;
            case 777: newLetter = 'r'; break;
            case 7777: newLetter = 's'; break;
            case 8: newLetter = 't'; break;
            case 88: newLetter = 'u'; break;
            case 888: newLetter = 'v'; break;
            case 9: newLetter = 'w'; break;
            case 99: newLetter = 'x'; break;
            case 999: newLetter = 'y'; break;
            case 9999: newLetter = 'z'; break;
            default: break;
        }
        return newLetter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCharacters = Integer.parseInt(input.nextLine());

        int character;

        for (int a = 1; a <= numberOfCharacters; a++) {
            character = Integer.parseInt(input.nextLine());
            char letter = addLetter(character);
            System.out.print(letter);
        }
    }
}
