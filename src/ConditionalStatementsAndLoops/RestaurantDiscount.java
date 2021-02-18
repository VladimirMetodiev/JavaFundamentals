package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int groupSize = Integer.parseInt(input.nextLine());
        String pack = input.nextLine().toLowerCase();

        double price = 0.0;
        String hall = "";

        if(groupSize <= 50)
        {
            hall = "Small Hall";
            price += 2500;
            switch (pack)
            {
                case "normal":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 500) * 0.95 / groupSize);
                    break;
                case "gold":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 750) * 0.9 / groupSize);
                    break;
                case "platinum":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 1000) * 0.85 / groupSize);
                    break;
                default:
                    break;
            }
        }
        else if (groupSize <= 100)
        {
            hall = "Terrace";
            price += 5000;
            switch (pack)
            {
                case "normal":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 500) * 0.95 / groupSize);
                    break;
                case "gold":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 750) * 0.9 / groupSize);
                    break;
                case "platinum":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 1000) * 0.85 / groupSize);
                    break;
                default:
                    break;
            }
        }
        else if (groupSize <= 120)
        {
            hall = "Great Hall";
            price += 7500;
            switch (pack)
            {
                case "normal":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 500) * 0.95 / groupSize);
                    break;
                case "gold":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 750) * 0.9 / groupSize);
                    break;
                case "platinum":
                    System.out.printf("We can offer you the %s%n", hall);
                    System.out.printf("The price per person is %.2f$", price = (price + 1000) * 0.85 / groupSize);
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}
