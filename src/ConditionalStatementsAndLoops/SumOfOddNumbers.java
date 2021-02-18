package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int sum = 0;

        for(int a = 1; a <= 2 * number; a++) {
            if(a % 2 != 0)
            {
                System.out.println(a);
                sum += a;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}
