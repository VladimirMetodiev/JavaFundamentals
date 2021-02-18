package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        char letter;
        int index;
        char[] reverse = new char[1000];

        for (int i = 0; i < expression.length(); i++) {
            letter = expression.charAt(i);
            index = expression.length() - i - 1;
            reverse[index] = letter;
        }

        for (int print = 0; print < expression.length(); print++) {
            System.out.print(reverse[print]);
        }
    }
}
