package Methods;

import java.util.Scanner;

public class Orders {
    static void calculatePrice(String product, double quantity){
        double price = 0d;

        switch (product){
            case "coffee": price = 1.5; break;
            case "coke": price = 1.4; break;
            case "water": price = 1.0; break;
            case "snacks": price = 2.0; break;
            default: break;
        }

        price *= quantity;
        System.out.printf("%.2f", price);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine().toLowerCase();
        double quantity = Double.parseDouble(input.nextLine());

        calculatePrice(product, quantity);
    }
}
