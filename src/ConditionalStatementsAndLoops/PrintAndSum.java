package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int lastNumber = Integer.parseInt(input.nextLine());

        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.println();

        System.out.printf("Sum: %d", sum);
    }
}
