package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTableVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();
        int start = input.nextInt();

        for (int i = start; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", digit, i, digit * i);
        }
        if (start > 10) {
            System.out.printf("%d X %d = %d%n", digit, start, digit * start);
        }
    }
}
