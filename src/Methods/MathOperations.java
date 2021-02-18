package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    static void calculateResult(double a, String sing, double b){
        double result = 0d;
        switch (sing){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default: break;
        }

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = Double.parseDouble(input.nextLine());
        String operator = input.nextLine();
        double secondNumber = Double.parseDouble(input.nextLine());

        calculateResult(firstNumber, operator, secondNumber);
    }
}
