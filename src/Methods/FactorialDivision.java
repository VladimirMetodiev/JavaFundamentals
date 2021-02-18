package Methods;

import java.util.Scanner;

public class FactorialDivision {
    static double calculateFactorial(int num){
        double result = 1d;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        double firstFactorial = calculateFactorial(firstNumber);
        double secondFactorial = calculateFactorial(secondNumber);

        double division = firstFactorial / secondFactorial;

        System.out.printf("%.2f", division);
    }
}
