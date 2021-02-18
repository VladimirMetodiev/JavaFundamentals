package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        BigDecimal bigNumber;
        BigDecimal result = new BigDecimal("0");

        for (int i = 1; i <= number; i++) {
            bigNumber = new BigDecimal(input.nextLine());
            result = result.add(bigNumber);
        }

        System.out.println(result);
    }
}
