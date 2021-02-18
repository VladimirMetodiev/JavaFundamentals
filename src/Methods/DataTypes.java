package Methods;

import java.util.Scanner;

public class DataTypes {
    static void getMeaning(String a){
        System.out.printf("$%s$%n", a);
    }
    static void getMeaning(int b){
        System.out.println(b * 2);
    }
    static void getMeaning(double c){
        System.out.printf("%.2f%n", c * 1.5);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String meaning = input.nextLine().toLowerCase();
        String expression = input.nextLine();

        switch (meaning){
            case "string":{
                getMeaning(expression);
                break;
            }
            case "int":{
                int number = Integer.parseInt(expression);
                getMeaning(number);
                break;
            }
            case "real":{
                double realNumber = Double.parseDouble(expression);
                getMeaning(realNumber);
                break;
            }
            default: break;
        }

    }
}
