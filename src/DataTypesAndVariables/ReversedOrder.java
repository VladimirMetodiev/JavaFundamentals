package DataTypesAndVariables;

import java.util.Scanner;

public class ReversedOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char firstCharacter = input.nextLine().charAt(0);
        char secondCharacter = input.nextLine().charAt(0);
        char thirdCharacter = input.nextLine().charAt(0);

        System.out.printf("%s %s %s", thirdCharacter, secondCharacter, firstCharacter);
    }
}
