package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        if(firstNumber < secondNumber){
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        }
        else{
            for (int i = secondNumber; i <= firstNumber; i++) {
                System.out.println(i);
            }
        }
    }
}
