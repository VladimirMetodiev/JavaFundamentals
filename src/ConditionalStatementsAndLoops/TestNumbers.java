package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstDigit = Integer.parseInt(input.nextLine());
        int secondDigit = Integer.parseInt(input.nextLine());
        int boundary = Integer.parseInt(input.nextLine());

        int sum = 0;
        int counter = 0;

        for (int i = firstDigit; i >= 1; i--) {
            for (int j = 1; j <= secondDigit; j++) {
                if(sum >= boundary){
                    break;
                }
                sum += i * j * 3;
                counter++;
            }
        }

        if(sum >= boundary){
            System.out.printf("%d combinations%n", counter);
            System.out.printf("Sum: %d >= %d", sum, boundary);
        }
        else{
            System.out.printf("%d combinations%n", counter);
            System.out.printf("Sum: %d", sum);
        }
    }
}
