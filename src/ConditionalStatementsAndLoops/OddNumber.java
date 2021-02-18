package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        while(a % 2 == 0){
            System.out.println("Please write an odd number.");
            a = Integer.parseInt(input.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(a));
    }
}
