package Methods;

import java.util.Scanner;

public class MultiplicationSign {
    static void getTheSign(double a, double b, double c){
        double product = a * b * c;

        if(product == 0){
            System.out.println("zero");
        }
        else if(product > 0){
            System.out.println("positive");
        }
        else if(product < 0){
            System.out.println("negative");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = Double.parseDouble(input.nextLine());
        double secondNumber = Double.parseDouble(input.nextLine());
        double thirdNumber = Double.parseDouble(input.nextLine());

        getTheSign(firstNumber, secondNumber, thirdNumber);
    }
}

//Нулата не влиза в условието "positive", както е написано в заданието. Трябва да напиша условие "zero".
