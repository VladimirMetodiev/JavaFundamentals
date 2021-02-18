package Exam;

import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int days = Integer.parseInt(input.nextLine());
        double budget = Double.parseDouble(input.nextLine());
        int people = Integer.parseInt(input.nextLine());
        double fuelPerKilometer = Double.parseDouble(input.nextLine());
        double foodExpenses = Double.parseDouble(input.nextLine());
        double priceForARoom = Double.parseDouble(input.nextLine());

        double currentExpenses, distanceInKmPerDay;

        if(people > 10){
            priceForARoom *= 0.75;
        }

        currentExpenses = days * people * (foodExpenses + priceForARoom);

        for (int a = 1; a <= days; a++) {
            distanceInKmPerDay = Double.parseDouble(input.nextLine());
            currentExpenses += distanceInKmPerDay * fuelPerKilometer;

            if(a % 3 == 0 || a % 5 ==0){
                currentExpenses += 0.4 * currentExpenses;
            }

            if(a % 7 == 0){
                currentExpenses -= currentExpenses / (double)people;
            }

            if (currentExpenses > budget){
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", currentExpenses - budget);
                return;
            }
        }

        System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - currentExpenses);

    }
}



//Mid Exam - 10 March 2019
