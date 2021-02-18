package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char firstCharacter = input.nextLine().charAt(0);
        char secondCharacter = input.nextLine().charAt(0);
        char thirdCharacter = input.nextLine().charAt(0);

        String expression = "" + firstCharacter + secondCharacter + thirdCharacter;
        System.out.println(expression);
    }
}
