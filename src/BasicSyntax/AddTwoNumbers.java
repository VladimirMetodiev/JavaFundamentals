package BasicSyntax;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        int sum = firstNumber + secondNumber;

        System.out.printf("%d + %d = %d", firstNumber, secondNumber, sum);
    }
}
