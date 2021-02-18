package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    static double discount(String type, double group){
        double discounts = 1d;

        if(type.equals("students")){
            if(group >= 30){
                discounts = 0.85;
            }
        }
        else if(type.equals("business")){
            if(group >= 100){
                discounts = (group - 10) / group;
            }
        }
        else if(type.equals("regular")){
            if(group >= 10 && group <= 20){
                discounts = 0.95;
            }
        }

        return discounts;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTheGroup = Integer.parseInt(input.nextLine());
        String typeOfTheGroup = input.nextLine().toLowerCase();
        String dayOfTheWeek = input.nextLine().toLowerCase();

        double totalPrice = 0d;

        if(dayOfTheWeek.equals("friday")){
            switch (typeOfTheGroup){
                case "students": totalPrice = 8.45; break;
                case "business": totalPrice = 10.9; break;
                case "regular": totalPrice = 15.0; break;
                default: break;
            }
            totalPrice = totalPrice * numberOfTheGroup * discount(typeOfTheGroup, numberOfTheGroup);
        }
        else if(dayOfTheWeek.equals("saturday")){
            switch (typeOfTheGroup){
                case "students": totalPrice = 9.8; break;
                case "business": totalPrice = 15.6; break;
                case "regular": totalPrice = 20.0; break;
                default: break;
            }
            totalPrice = totalPrice * numberOfTheGroup * discount(typeOfTheGroup, numberOfTheGroup);
        }
        else if(dayOfTheWeek.equals("sunday")){
            switch (typeOfTheGroup){
                case "students": totalPrice = 10.46; break;
                case "business": totalPrice = 16.0; break;
                case "regular": totalPrice = 22.5; break;
                default: break;
            }
            totalPrice = totalPrice * numberOfTheGroup * discount(typeOfTheGroup, numberOfTheGroup);
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
