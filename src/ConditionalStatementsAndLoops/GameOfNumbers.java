package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());
        int magicNumber = Integer.parseInt(input.nextLine());

        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        int counter = 0;
        boolean equal = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                counter++;
                sum = i + j;
                if(sum == magicNumber){
                    num1 = i;
                    num2 = j;
                    equal = true;
                }
            }
        }

        if(equal == true){
            System.out.printf("Number found! %d + %d = %d", num1, num2, num1 + num2);
        }
        else{
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }
    }
}
