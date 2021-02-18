package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String typeOfDay = input.nextLine().toLowerCase();
        int age = Integer.parseInt(input.nextLine());

        if(age >= 0 && age <= 18){
            switch(typeOfDay){
                case "weekday":{
                    System.out.println("12$");
                    break;
                }
                case "weekend":{
                    System.out.println("15$");
                    break;
                }
                case "holiday":{
                    System.out.println("5$");
                    break;
                }
                default:{
                    break;
                }
            }
        }
        else if(age > 18 && age <= 64){
            switch(typeOfDay){
                case "weekday":{
                    System.out.println("18$");
                    break;
                }
                case "weekend":{
                    System.out.println("20$");
                    break;
                }
                case "holiday":{
                    System.out.println("12$");
                    break;
                }
                default:{
                    break;
                }
            }
        }
        else if(age > 64 && age <= 122){
            switch(typeOfDay){
                case "weekday":{
                    System.out.println("12$");
                    break;
                }
                case "weekend":{
                    System.out.println("15$");
                    break;
                }
                case "holiday":{
                    System.out.println("10$");
                    break;
                }
                default:{
                    break;
                }
            }
        }
        else{
            System.out.println("Error!");
        }
    }
}
