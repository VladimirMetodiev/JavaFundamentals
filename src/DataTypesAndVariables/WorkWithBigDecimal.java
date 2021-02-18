package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class WorkWithBigDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        BigDecimal firstNumber = new BigDecimal(input.nextLine()); // дефинирам и въвеждам стойността на променлива от тип BigDecimal
        System.out.print("Enter a real number: ");
        BigDecimal secondNumber = new BigDecimal(input.nextLine());

        BigDecimal thirdNumber = new BigDecimal("3.14"); // дефинирам и имлементирам променлива от тип BigDecimal

        BigDecimal add;
        BigDecimal subtract;
        BigDecimal multiply;
        BigDecimal divide;
        BigDecimal squareRoot;

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
        try{
            divide = firstNumber.divide(secondNumber);
            System.out.println(divide);
        }
        catch(Exception ex){
            System.out.println("Can't divide it.");
        }
    }
}
