package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    static void calculateProduct(String num){
        int length = num.length();
        int number = Integer.parseInt(num);

        int sumOfEvenDigits = 0, sumOfOddDigits = 0, digit = 0;

        for (int a = 1; a <= length; a++) {
            digit = number % 10;
            if(digit % 2 == 0){
                sumOfEvenDigits += digit;
            }
            else{
                sumOfOddDigits += digit;
            }
            number /= 10;
        }

        System.out.println(sumOfEvenDigits * sumOfOddDigits);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        calculateProduct(expression);
    }
}
