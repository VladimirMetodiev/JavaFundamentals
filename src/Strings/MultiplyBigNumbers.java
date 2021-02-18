package Strings;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigDecimal factor1 = new BigDecimal(input.nextLine());
        BigDecimal factor2 = new BigDecimal(input.nextLine());

        BigDecimal product = factor1.multiply(factor2);

        System.out.println(product);
    }
}
