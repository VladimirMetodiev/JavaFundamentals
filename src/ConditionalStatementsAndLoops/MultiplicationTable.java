package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", digit, i, digit * i);
        }
    }
}
