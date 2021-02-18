package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int lastNumber = Integer.parseInt(input.nextLine());

        char letter;

        for (int i = firstNumber; i <= lastNumber; i++) {
            letter = (char)i;
            System.out.print(letter + " ");
        }
    }
}
