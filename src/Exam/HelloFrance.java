package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] expression = input.nextLine().split("\\|");
        double budget = Double.parseDouble(input.nextLine());

        String[] data;
        String product;
        double price, profit = 0.0, moneyOnHand = budget;
        ArrayList<Double> salePrices = new ArrayList<>();

        for (int a = 0; a < expression.length; a++) {
            data = expression[a].split("->");
            product = data[0];
            price = Double.parseDouble(data[1]);

            if(price > moneyOnHand){
                continue;
            }

            if(product.equals("Clothes") && price <= 50.0){
                salePrices.add(price * 1.4);
                moneyOnHand -= price;
                profit += price * 0.4;
            }
            else if(product.equals("Shoes") && price <= 35.0){
                salePrices.add(price * 1.4);
                moneyOnHand -= price;
                profit += price * 0.4;
            }
            else if(product.equals("Accessories") && price <= 20.50){
                salePrices.add(price * 1.4);
                moneyOnHand -= price;
                profit += price * 0.4;
            }
        }

        for(Double prices : salePrices){
            System.out.printf("%.2f ", prices);
        }
        System.out.println();

        System.out.printf("Profit: %.2f%n", profit);

        if(budget + profit >= 150.0){
            System.out.println("Hello, France!");
        }
        else{
            System.out.println("Time to go.");
        }
    }
}



//Mid Exam - 10 March 2019



//Tests:

//Input
//Clothes->43.30|Shoes->25.25|Clothes->36.52|Clothes->20.90|Accessories->15.60
//120

//Output
//60,62 35,35 51,13
//Profit: 42,03
//Hello, France!


//Input
//Shoes->41.20|Clothes->20.30|Accessories->40|Shoes->15.60|Shoes->33.30|Clothes->48.60
//90

//Output
//28,42 21,84 46,62
//Profit: 27,68
//Time to go.
