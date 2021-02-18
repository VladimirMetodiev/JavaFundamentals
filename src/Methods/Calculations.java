package Methods;

import java.util.Scanner;

public class Calculations {
    static void addNumbers(int a, int b){
        System.out.println(a + b);
    }
    static void subtractNumbers(int a, int b){
        System.out.println(a - b);
    }
    static void multiplyNumbers(int a, int b){
        System.out.println(a * b);
    }
    static void divideNumbers(int a, int b){
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine().toLowerCase();
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        switch (command){
            case "add": addNumbers(firstNumber, secondNumber); break;
            case "subtract": subtractNumbers(firstNumber, secondNumber); break;
            case "multiply": multiplyNumbers(firstNumber, secondNumber); break;
            case "divide": divideNumbers(firstNumber, secondNumber); break;
            default: break;
        }
    }
}
