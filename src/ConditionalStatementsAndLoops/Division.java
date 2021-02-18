package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int divisor = 0;

        if(number % 2 == 0){
            divisor = 2;
        }
        if(number % 3 == 0){
            divisor = 3;
        }
        if(number % 6 == 0){
            divisor = 6;
        }
        if(number % 7 == 0){
            divisor = 7;
        }
        if(number % 10 == 0){
            divisor = 10;
        }

        if(divisor > 0){
            System.out.printf("The number is divisible by %d", divisor);
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
