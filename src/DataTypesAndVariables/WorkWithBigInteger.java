package DataTypesAndVariables;

import java.math.BigInteger;
import java.util.Scanner;

public class WorkWithBigInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        BigInteger firstNumber = new BigInteger(input.nextLine()); // дефинирам и въвеждам стойността на променлива от тип BigInteger
        System.out.print("Enter an integer: ");
        BigInteger secondNumber = new BigInteger(input.nextLine());

        BigInteger thirdNumber = new BigInteger("9"); // дефинирам и имлементирам променлива от тип BigInteger

        long longNumber = 189564376219476L;
        BigInteger example = new BigInteger("0");
        example = example.valueOf(longNumber);

        BigInteger add;
        BigInteger subtract;
        BigInteger multiply;
        BigInteger divide;
        BigInteger squareRoot;
        BigInteger power;

        System.out.println("Addition");
        add = firstNumber.add(secondNumber);
        System.out.println(add);

        System.out.println("Subtraction");
        subtract = firstNumber.subtract(secondNumber);
        System.out.println(subtract);

        System.out.println("Multiplication");
        multiply = firstNumber.multiply(secondNumber);
        System.out.println(multiply);

        System.out.println("Division");
        divide = firstNumber.divide(secondNumber);
        System.out.println(divide);

    }
}
