package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String food = "";
        int counter = 0;
        int cheese = 500;
        int tomatoSauce = 150;
        int salami = 600;
        int pepper = 50;


        for (int i = 1; i <= number; i++) {
            food = input.nextLine().toLowerCase();
            switch (food){
                case "cheese":{
                    counter += cheese;
                    break;
                }
                case "tomato sauce":{
                    counter += tomatoSauce;
                    break;
                }
                case "salami":{
                    counter += salami;
                    break;
                }
                case "pepper":{
                    counter += pepper;
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.printf("Total calories: %d", counter);
    }
}
