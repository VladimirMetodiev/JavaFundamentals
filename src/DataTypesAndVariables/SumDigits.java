package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        int number = Integer.parseInt(expression);
        int sum = 0;

        for(int a = 0; a < expression.length(); a++){
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}
