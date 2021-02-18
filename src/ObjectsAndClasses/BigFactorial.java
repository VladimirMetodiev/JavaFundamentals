package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        Factorial fct = new Factorial();

        fct.calculatesFactorial(number);
    }
}

class Factorial{
    void calculatesFactorial(int number){
        BigInteger result = BigInteger.valueOf(1);

        for (int index = 1; index <= number; index++) {
            result = result.multiply(BigInteger.valueOf(index));
        }

        System.out.println(result);
    }
}
