package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int num = number;
        int remainder;
        int factorial = 1;
        int sum = 0;

        while(true){
            if(num > 0){
                remainder = num % 10;
                for (int i = remainder; i > 0; i--) {
                    factorial *= i;
                }
                num = num / 10;
                sum += factorial;
                factorial = 1;
            }
            else{
                break;
            }
        }

        if(sum == number){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
