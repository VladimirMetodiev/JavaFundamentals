package Methods;

import java.util.Scanner;

public class CharactersInRange {
    static void printAllCharactersInTheRange(char first, char second){
        int a = (int)first;
        int b = (int)second;

        if(a < b){
            for (int index = a + 1; index < b; index++) {
                System.out.printf("%c ", index);
            }
        }
        else{
            for (int index = b + 1; index < a; index++) {
                System.out.printf("%c ", index);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char firstCharacter = input.nextLine().charAt(0);
        char secondCharacter = input.nextLine().charAt(0);

        printAllCharactersInTheRange(firstCharacter, secondCharacter);
    }
}
