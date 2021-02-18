package Lambda;

import java.util.Scanner;

public class LambdaExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        int result;

        Mathematical addition;
        addition = (x, y) -> x + y;
        Mathematical subtraction;
        subtraction = (x, y) -> x - y;

        result = addition.calculate(firstNumber, secondNumber);
        System.out.println(result);
        result = subtraction.calculate(firstNumber, secondNumber);
        System.out.println(result);
    }
}

interface Mathematical{
    int calculate(int a, int b);
}