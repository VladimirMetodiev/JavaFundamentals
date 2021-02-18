package DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result;

        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());
        int thirdNumber = Integer.parseInt(input.nextLine());
        int fourthNumber = Integer.parseInt(input.nextLine());

        result = firstNumber + secondNumber;
        result = (int)(result / thirdNumber);
        result *= fourthNumber;

        System.out.println(result);
    }
}
